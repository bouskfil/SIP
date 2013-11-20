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
@Security.Authenticated(Secured.class)
public class OtherController extends Controller{
    
    final static Form<User> userForm = form(User.class);

    public static Result choose() {
        switch(Application.loggedUser.userRole){
            case "admin": 
                return ok(choose.render(Application.loggedUser));
            case "student": 
                return ok(choose.render(Application.loggedUser));
                //return ok("Student tu zatím nic nemá.");
            case "teacher": 
                return ok("Učitel tu zatím nic nemá.");
            default:
                return ok("Neznámá uživatelská role.");           
        }
        
    }
    
    public static Result create() {
        if(Application.loggedUser.userRole.equals("admin"))
        return ok(create.render(userForm, Application.loggedUser));
        else return ok("Přístupné pouze adminovi.");
    }
    public static Result showAll() {
        if(Application.loggedUser.userRole.equals("admin"))
        return ok(showAll.render(User.find.all(), Application.loggedUser));
        else return ok("Přístupné pouze adminovi.");
    }
    
    public static Result editPassword(){
        Form<User> prefilledForm=form(User.class).fill(Application.loggedUser);
        
        return ok(editPassword.render(prefilledForm,Application.loggedUser));
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
            return badRequest(create.render(filledForm, Application.loggedUser));
        } else {
            User user = filledForm.get();
            user.save();
            return ok(createSummary.render(user, Application.loggedUser));
        }
        
    }
    
    public static Result changePassword(String name,String email, String userRole){        
        Form<User> filledForm = userForm.bindFromRequest();
        
        if(!filledForm.field("password").valueOr("").isEmpty()) {
            if(!filledForm.field("password").valueOr("").equals(filledForm.field("repeatPassword").value())) {
                filledForm.reject("repeatPassword", "Hesla nejsou stejná.");
            }
        }
        
        if(filledForm.hasErrors()) {
            return badRequest(editPassword.render(filledForm, Application.loggedUser));
        } else {
            User user = filledForm.get();
            user.name=name;
            user.email=email;
            user.userRole=userRole;
            user.update();
            return ok(editPasswordSummary.render(user, Application.loggedUser));
        }
    }
    
}
