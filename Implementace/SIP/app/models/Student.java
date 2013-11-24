package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: MacBook
 * Date: 17.11.13
 * Time: 16:40
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Student extends Model {

    @Id
    private long id;

    @Constraints.Required
    private String name;
    @Constraints.Required
    private String lastname;
    @Constraints.Required
    private String email;

    @OneToOne
    private Schedule schedule;
    @OneToOne
    private Address address;

    @ManyToMany(cascade = CascadeType.REMOVE)
    private List<Subject> subjects = new ArrayList<Subject>();
    @ManyToMany(cascade = CascadeType.REMOVE)
    private List<Task> tasks = new ArrayList<Task>();
    @ManyToMany(cascade = CascadeType.REMOVE)
    private List<Exam> exams = new ArrayList<Exam>();

    public static Finder<Long, Student> find = new Finder(Long.class, Student.class);
    
    public Student(String name, String lastname, String email){
        this.email = email;
        this.name = name;
        this.lastname = lastname;
    }

    public static void create(Student student){
        student.save();
    }

    public static void delete(Long id){
        find.ref(id).delete();
    }

    //<editor-fold desc="getters and setters">
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }
    //</editor-fold>

}
