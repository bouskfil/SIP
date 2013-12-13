package models;

/**
 * Created with IntelliJ IDEA.
 * User: Filip Bouška
 * Date: 07.11.13
 * Time: 22:25
 */

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Teacher extends Model{

    @Id
    public Long id;

    @Constraints.Required
    private String name;
    @Constraints.Required
    private String lastname;
    @Constraints.Required
    private String email;
    
    @ManyToMany(cascade = CascadeType.REMOVE)
    private List<Subject> subjects = new ArrayList<Subject>();

    public static Finder<Long, Teacher> find = new Finder(Long.class, Teacher.class);
    
    public Teacher(String name, String lastname, String email){
        this.email = email;
        this.name = name;
        this.lastname = lastname;
    }

    public static void create(Teacher teacher){
        teacher.save();
    }

    public static List<Teacher> all(){
        return find.all();
    }

    public static void delete(Long id){
        find.ref(id).delete();
    }
    public static List<String> getAllNames(){
        List<String> names = new ArrayList();
        for(Teacher t : all()) {
            names.add(t.name);
        }
        return names;
    }
    public void addSubject(Subject s){
        this.subjects.add(s);
    }
    
    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
