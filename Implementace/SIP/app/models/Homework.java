/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

/**
 *
 * @author Dominik
 */

import play.data.validation.Constraints;
import play.db.ebean.Model;
import javax.persistence.*;
import java.util.Date;
import java.util.HashMap; 

@Entity
public class Homework extends Model{
    
    @Id
    public Long id;
    
    @Constraints.Required
    public String subjectCode;
    
    @Constraints.Required
    private String name;
    
    @Constraints.Required
    private Date deadline;
    
    @Constraints.Required
    private String description;
    
    private HashMap<Student, String> submittedHomeworks = new HashMap<Student, String>();
    
    public static Finder<Long, Homework> find = new Finder(Long.class, Homework.class);
    
    public Homework(String subjectCode, String name, Date deadline, String description){
        this.subjectCode = subjectCode;
        this.name = name;
        this.deadline = deadline;
        this.description = description;
    }
    public Homework(){
        
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public void setSubjectCode(String subjectCode){
        this.subjectCode = subjectCode;
    }
    public String getSubjectCode(){
        return this.subjectCode;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setDeadline(Date deadline){
        this.deadline = deadline;
    }
    public Date getDeadline(){
        return this.deadline;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setSubmittedHomeworks(HashMap<Student, String> submittedHomeworks){
        this.submittedHomeworks = submittedHomeworks;
    }
    public HashMap<Student, String> getSubmittedHomeworks(){
        return this.submittedHomeworks;
    }
}
