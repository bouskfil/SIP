package controllers;

/**
 * Created with IntelliJ IDEA.
 * User: MacBook
 * Date: 10.11.13
 * Time: 15:25
 * To change this template use File | Settings | File Templates.
 */
import play.mvc.Http.Context;
import play.mvc.Result;
import play.mvc.Security;

public class Secured extends Security.Authenticator {

    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("email");
    }

    @Override
    public Result onUnauthorized(Context ctx) {
        return redirect(routes.Application.login());
    }
}