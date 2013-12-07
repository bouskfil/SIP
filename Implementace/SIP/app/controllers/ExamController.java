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
        switch (user.getUserRole()) {
            case "student":
                List<Student> studList = Student.find.where().ilike("email", "%"+user.getEmail()+"%").findList();
                Student stud = studList.get(0);               // current student
                List<Subject> subjList = stud.getSubjects();  // the list of student's subjects
                List<Exam> exList = new ArrayList<>();      // list of exams from student's subjects

                for (Subject subj: subjList) {
                    exList.addAll(Exam.find.where().ilike("subjectCode", "%"+subj.getCode()+"%").findList());
                }
                return ok(studentList.render(exList, stud, user));
            case "teacher":
                List<Teacher> teachList = Teacher.find.where().ilike("email", "%"+user.getEmail()+"%").findList();
                Teacher teacher = teachList.get(0);
                return ok(teacherList.render(Exam.find.all(), teacher, user));
            default:
                return ok("Tato stránka je určena pouze pro učitele nebo studenty.");

        }
    }


    public static Result create() {
        return ok(form.render(formExam, User.find.byId(session("email"))));
    }


    public static Result save(Long id) {
        Form<Exam> filledForm = formExam.bindFromRequest();

        if(filledForm.hasErrors()) {
            return redirect(routes.ExamController.edit(id));
        }
        else {
            Exam exam = filledForm.get();
            exam.copyExam(id);
            return redirect(routes.ExamController.blank());
        }
    }


    public static Result enrol(Long id) {
        Student stud = User.getStudent();
        Exam exam = Exam.find.byId(id);
        stud.addExam(exam);
        stud.update();
        return ok(enrol.render(exam, User.find.byId(session("email"))));
    }


    public static Result cancel(Long id) {
        Student stud = User.getStudent();
        Exam exam = Exam.find.byId(id);
        stud.removeExam(exam);
        stud.update();
        return ok(cancel.render(exam, User.find.byId(session("email"))));
    }

    public static Result add() {
        Form<Exam> filledForm = formExam.bindFromRequest();

        if (filledForm.hasErrors()) {
            return badRequest(form.render(filledForm, User.find.byId(session("email"))));
        }
        else {
            Exam exam = filledForm.get();
            exam.save();
            return redirect(routes.ExamController.blank());
        }
    }


    public static Result delete(Long id) {
        Exam.delete(id);
        return redirect(routes.ExamController.blank());
    }


    public static Result edit(Long id) {
        Exam existingExam = Exam.find.ref(id);
        Form<Exam> prefilledForm = form(Exam.class).fill(existingExam);
        return ok(edit.render(prefilledForm, User.find.byId(session("email"))));
    }


    public static Result detail(Long id) {
        return ok(detail.render(Exam.find.byId(id), User.find.byId(session("email"))));
    }

}