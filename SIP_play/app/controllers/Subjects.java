package controllers;

import models.Subject;
import models.Teacher;
import play.data.*;
import play.db.ebean.Model;
import play.mvc.*;

import java.util.List;
import views.html.subjects.*;

import static play.data.Form.*;


/**
 * Created with IntelliJ IDEA.
 * User: MacBook
 * Date: 09.11.13
 * Time: 15:29
 * To change this template use File | Settings | File Templates.
 */
@Security.Authenticated(Secured.class)
public class Subjects extends Controller {

    final static Form<Subject> subjectForm = form(Subject.class, Subject.All.class);
    final static List<Teacher> teachers = new Model.Finder(String.class, Teacher.class).all();

    public static Result blank() {
        List<Subject> subjects = new Model.Finder(String.class, Subject.class).all();
        return ok(views.html.subjects.list.render(subjects));
    }

    public static Result blankCreate(){
        return ok(form.render(subjectForm, teachers));
    }

    public static Result add() {
        Subject subject = Form.form(Subject.class).bindFromRequest().get();
        subject.save();
        return redirect(routes.Subjects.blank());
    }

    public static Result delete(Long id) {
        Subject.delete(id);
        return redirect(routes.Subjects.blank());
    }

    public static Result edit(Long id) {
        Subject existingSubject = Subject.find.ref(id);
        Form<Subject> subjectForm1 = form(Subject.class).fill(existingSubject);
        return ok(edit.render(subjectForm1, teachers));
    }

    public static Result save(Long id) {
        Subject subject = Form.form(Subject.class).bindFromRequest().get();
        Subject oldSubject = Subject.find.byId(id);
        oldSubject.name = subject.name;
        oldSubject.katedra = subject.katedra;
        oldSubject.garant = subject.garant;

        oldSubject.update();
        return redirect(routes.Subjects.blank());
    }



}
