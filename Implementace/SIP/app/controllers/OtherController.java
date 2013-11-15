/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import play.data.validation.Constraints.*;
import models.*;


import views.html.other.*;
/**
 *
 * @author Dominik
 */
public class OtherController extends Controller{

    public static Result choose() {
        return ok(choose.render());
    }
}
