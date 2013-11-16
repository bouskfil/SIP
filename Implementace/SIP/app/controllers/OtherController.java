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
    public static Result showAll() {
        return ok(showAll.render(User.find.all()));
    }
    
    public static Result add() {
        
        
        Form<User> filledForm = userForm.bindFromRequest();
        
        
        // Check repeated password
        if(!filledForm.field("password").valueOr("").isEmpty()) {
            if(!filledForm.field("password").valueOr("").equals(filledForm.field("repeatPassword").value())) {
                filledForm.reject("repeatPassword", "Hesla nejsou stejná.");
            }
        }
        
        
        
        if(filledForm.hasErrors()) {
            return badRequest(create.render(filledForm));
        } else {
            User user = filledForm.get();
            user.save();
            return ok(createSummary.render(user));
        }
        
    }
    
}
