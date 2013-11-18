package controllers;

/**
 * Created with IntelliJ IDEA.
 * User: Filip Bouška
 * Date: 07.11.13
 * Time: 22:25
 */

import models.Subject;
import play.data.*;
import play.mvc.*;
import views.html.subjects.*;
import static play.data.Form.*;

@Security.Authenticated(Secured.class)
public class SubjectController extends Controller {

    final static Form<Subject> formSubject = form(Subject.class);

    public static Result blank() {
        return ok(list.render(Subject.find.all()));
    }

    public static Result create(){
        return ok(form.render(formSubject));
    }

    public static Result add() {
        Subject subject = Form.form(Subject.class).bindFromRequest().get();
        subject.save();
        return redirect(routes.SubjectController.blank());
    }

    public static Result delete(Long id) {
        Subject.delete(id);
        return redirect(routes.SubjectController.blank());
    }

    public static Result edit(Long id) {
        Subject existingSubject = Subject.find.ref(id);
        Form<Subject> prefilledForm = form(Subject.class).fill(existingSubject);
        return ok(edit.render(prefilledForm));
    }

    public static Result save(Long id) {
        Subject subject = Form.form(Subject.class).bindFromRequest().get();
        subject.copySubject(id);
        return redirect(routes.SubjectController.blank());
    }



}
