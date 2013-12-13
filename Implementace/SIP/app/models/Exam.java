package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.io.*;


/**
 * Created with IntelliJ IDEA.
 * User: MacBook
 * Date: 16.11.13
 * Time: 20:04
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class Exam extends Model {

    @Id
    private Long id;

    @Constraints.Required
    private String subjectCode;
    @Constraints.Required
    //private Date date;
    //private SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy hh:mm");
    String date;
    @Constraints.Required
    private String room;
    @Constraints.Required
    private String examiner;

    @ManyToMany
    private List<Student> students = new ArrayList<Student>();

    public static Finder<Long, Exam> find = new Finder(Long.class, Exam.class);

    public static void create(Exam exam){
        exam.save();
    }

    public boolean copyExam(Long id){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        try {
            sdf.setLenient(false);
            Date d = sdf.parse(this.date);
        } catch(Exception e) {
            return false;
        }
        Exam oldExam = Exam.find.byId(id);
        oldExam.subjectCode = this.subjectCode;
        oldExam.date = this.date;
        oldExam.room = this.room;
        oldExam.examiner = this.examiner;
        oldExam.update();
        return true;
    }


    public static void delete(Long id) {
        find.ref(id).delete();
    }

    public Long getId() {
        return id;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public static boolean save(Exam exam) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        try {
            sdf.setLenient(false);
            Date d = sdf.parse(exam.date);
            exam.save();
            return true;
        } catch(Exception e) {
            return false;
        }
    }


    public void removeStudent(Student student) {
        students.remove(student);
    }

    public boolean isAdded(Student student) {
        return students.contains(student);
    }


    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getExaminer() {
        return examiner;
    }

    public void setExaminer(String examiner) {
        this.examiner = examiner;
    }
}
