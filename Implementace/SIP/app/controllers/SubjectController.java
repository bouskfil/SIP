package controllers;

/**
 * Created with IntelliJ IDEA.
 * User: Filip Bouška
 * Date: 07.11.13
 * Time: 22:25
 */

import com.google.common.primitives.Longs;
import models.*;
import play.data.*;
import play.mvc.*;
import views.html.subjects.*;

import java.util.List;

import static play.data.Form.*;

@Security.Authenticated(Secured.class)
public class SubjectController extends Controller {

    final static Form<Subject> formSubject = form(Subject.class);



    public static Result blank() {
        List<Subject> subjects = Subject.find.where().orderBy("name asc").findList();
        return ok(list.render(subjects, User.find.byId(session("email"))));
    }

    public static Result create(){
        return ok(form.render(formSubject, User.find.byId(session("email"))));
    }

    public static Result add() {
        Form<Subject> filledForm = formSubject.bindFromRequest();
        if(filledForm.hasErrors()) {
            return badRequest(form.render(filledForm, User.find.byId(session("email"))));
        } else {
            Subject subject = filledForm.get();
            subject.save();
            return redirect(routes.SubjectController.blank());
            }
    }

    public static Result delete(Long id) {
        Subject.delete(id);
        return redirect(routes.SubjectController.blank());
    }

    public static Result edit(Long id) {
        Subject existingSubject = Subject.find.ref(id);
        Form<Subject> prefilledForm = form(Subject.class).fill(existingSubject);
        return ok(edit.render(prefilledForm, User.find.byId(session("email"))));
    }

    public static Result save(Long id) {
        Form<Subject> filledForm = formSubject.bindFromRequest();

        if(filledForm.hasErrors()) {
            return redirect(routes.SubjectController.edit(id));
        } else {
            Subject subject = filledForm.get();

            subject.copySubject(id);
            return redirect(routes.SubjectController.blank());
        }
    }

    public static Result detail(Long id) {
        return ok(detail.render(Subject.find.byId(id), User.find.byId(session("email"))));
    }

    public static Result enrol(Long id) {
        Student stud = User.getStudent();
        Subject sub = Subject.find.byId(id);
        if(stud.getSubjects().contains(sub)){
            return ok(error.render(sub, User.find.byId(session("email"))));
        } else  {
            stud.addSubject(sub);
            stud.update();
            return ok(enrol.render(Subject.find.byId(id), User.find.byId(session("email"))));
        }
    }

    public static Result enrolList() {
        Student stud = User.getStudent();
        return ok(enrolList.render(stud, User.find.byId(session("email"))));
    }

    public static Result leaveSubject(Long id){
        Student stud = User.getStudent();
        Subject sub = Subject.find.byId(id);
        stud.getSubjects().remove(sub);
        stud.update();
        return ok(detail.render(Subject.find.byId(id), User.find.byId(session("email"))));
    }
}
