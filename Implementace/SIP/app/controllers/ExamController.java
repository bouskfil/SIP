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

@Security.Authenticated(Secured.class)
public class ExamController extends Controller {

    final static Form<Exam> formExam = form(Exam.class);

    public static Result blank() {
        return ok(list.render(Exam.find.all(), User.find.byId(session("email"))));
    }

    public static Result create() {
        return ok(form.render(formExam, User.find.byId(session("email"))));
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