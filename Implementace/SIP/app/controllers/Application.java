package controllers;

/**
 * Created with IntelliJ IDEA.
 * User: Filip Bouška
 * Date: 07.11.13
 * Time: 22:25
 */

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import models.*;
import views.html.*;

public class Application extends Controller {
    
    public static User loggedUser;

    @Security.Authenticated(Secured.class)
    public static Result index() {
        loggedUser=User.find.byId(request().username());
        return ok(index.render(loggedUser)); 
    }

    public static Result login() {
        return ok(login.render(form(Login.class)));
    }

    public static Result logout() {
        session().clear();
        flash("success", "Byli jste v pořádku odhlášeni.");
        return redirect(
                routes.Application.login()
        );
    }

    public static Result authenticate() {
        Form<Login> loginForm = form(Login.class).bindFromRequest();
        if (loginForm.hasErrors()) {
            return badRequest(views.html.login.render(loginForm));
        } else {
            session().clear();
            session("email", loginForm.get().email);
            return redirect(
                    routes.Application.index()
            );
        }
    }

    public static class Login {

        public String email;
        public String password;

        public String validate() {
            if (User.authenticate(email, password) == null) {
                return "Špatné uživatelské jméno nebo heslo. (zkuste: admin@admin.com a heslo: admin)";
            }
            return null;
        }

    }
}
