/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import models.User;
import play.data.*;
import play.mvc.*;
import views.html.other.*;
import static play.data.Form.*;
/**
 *
 * @author Dominik
 */
public class OtherController extends Controller{
    
    final static Form<User> userForm = form(User.class, User.All.class);

    public static Result choose() {
        return ok(choose.render());
    }
    
    public static Result create() {
        return ok(create.render(userForm));
    }
    
    public static Result add() {
        User user = Form.form(User.class).bindFromRequest().get();
        user.save();
        return redirect(routes.OtherController.choose());
    }
    
}
