package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    public Long id;

    @Constraints.Required
    public String subjectCode;
    @Constraints.Required
    public Date date;
    @Constraints.Required
    public String room;
    @Constraints.Required
    public String examiner;

    @ManyToMany
    public List<Student> students = new ArrayList<Student>();

    public static Finder<Long, Exam> find = new Finder(Long.class, Exam.class);

    public static void create(Exam exam){
        exam.save();
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
