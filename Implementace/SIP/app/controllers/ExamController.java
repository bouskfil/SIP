package controllers;

/**
 * Created with IntelliJ IDEA.
 * User: Tomas
 * Date: 24.11.13
 * Time: 14:10
 */

import models.*;
import play.data.*;
import play.mvc.*;
import views.html.exams.*;
import static play.data.Form.*;

import java.util.List;
import java.util.ArrayList;


@Security.Authenticated(Secured.class)
public class ExamController extends Controller {
    final static Form<Exam> formExam = form(Exam.class);


    public static Result blank() {
        User user = User.find.byId(session("email"));

        if (user.getUserRole().equals("student")) {
          List<Student> studList = Student.find.where().ilike("email", "%"+user.getEmail()+"%").findList();
          Student stud = studList.get(0);               // current student
          List<Subject> subjList = stud.getSubjects();  // the list of student's subjects
          List<Exam> examList = new ArrayList<>();                          // list of exams from student's subjects

          for (Subject subj: subjList) {
            examList.addAll(Exam.find.where().ilike("subjectCode", "%"+subj.getCode()+"%").findList());
          }
          return ok(studentList.render(examList, stud, user));
        }
        return ok(list.render(Exam.find.all(), User.find.byId(session("email"))));
    }


    public static Result create() {
        return ok(form.render(formExam, User.find.byId(session("email"))));
    }


    public static Result enrol(Long id) {
        Student stud = User.getStudent();
        Exam exam = Exam.find.byId(id);
//        if (stud.getExams().contains(exam)) {
//        }
//        else {
            stud.addExam(exam);
            stud.update();
            return ok(enrol.render(exam, User.find.byId(session("email"))));
//        }
    }


    public static Result cancel(Long id) {
        Student stud = User.getStudent();
        Exam exam = Exam.find.byId(id);
        stud.removeExam(exam);
        stud.update();
        return ok(cancel.render(exam, User.find.byId(session("email"))));
    }

    public static Result add() {
        Exam exam = Form.form(Exam.class).bindFromRequest().get();
        exam.save();
        return redirect(routes.ExamController.blank());
    }


    public static Result delete(Long id) {
        Exam.delete(id);
        return redirect(routes.ExamController.blank());
    }


    public static Result detail(Long id) {
        return ok(detail.render(Exam.find.byId(id), User.find.byId(session("email"))));
    }

}