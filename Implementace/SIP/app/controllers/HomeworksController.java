/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

/**
 *
 * @author Dominik
 */

import models.User;
import play.data.*;
import play.mvc.*;
import views.html.homeworks.*;
import static play.data.Form.*;

@Security.Authenticated(Secured.class)
public class HomeworksController extends Controller {
    
    public static Result blank() {
        return ok(subjectList.render(User.find.byId(session("email"))));
    }

}
