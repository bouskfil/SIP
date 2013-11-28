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

import models.*;
import play.data.*;
import play.mvc.*;
import views.html.homeworks.*;
import static play.data.Form.*;
import java.util.List;

@Security.Authenticated(Secured.class)
public class HomeworksController extends Controller {
    
    final static Form<Homework> homeworkForm = form(Homework.class);
    
    public static Result blank() {
        User u = User.find.byId(session("email"));
        switch(u.getUserRole()){
            case "student": 
                List<Student> studlist = Student.find.where().ilike("email", "%"+u.getEmail()+"%").findList();
                Student stud = studlist.get(0);
                return ok(subjectList.render(u,stud,null));
            case "teacher": 
                List<Teacher> teacherlist = Teacher.find.where().ilike("email", "%"+u.getEmail()+"%").findList();
                Teacher teacher = teacherlist.get(0);
                return ok(subjectList.render(u,null,teacher));    
            default:
                return ok("Tato stránka je určena pouze pro učitele nebo studenty.");
        }
    }
    
    public static Result create(Long id){
        if(User.find.byId(session("email")).getUserRole().equals("teacher")){
            Subject sub = Subject.find.byId(id);
            Homework home = new Homework();
            home.setSubjectCode(sub.getCode());
            Form<Homework> prefilledForm = form(Homework.class).fill(home);
            return ok(addHomework.render(prefilledForm,User.find.byId(session("email"))));
        }else
            return ok("Přístupné pouze učiteli.");
    }
    
    public static Result add(){
        Form<Homework> filledForm = homeworkForm.bindFromRequest();   
        
        if(filledForm.hasErrors()) {
            return badRequest(addHomework.render(filledForm, User.find.byId(session("email"))));
        }else{
            Homework newHomework = filledForm.get();
            newHomework.save();
            return ok(newHomeworkSummary.render(newHomework,User.find.byId(session("email"))));
        }
    }
}
