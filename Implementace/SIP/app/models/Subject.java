package models;

/**
 * Created with IntelliJ IDEA.
 * User: Filip Bouška
 * Date: 07.11.13
 * Time: 22:25
 */

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Subject extends Model{

    @Id
    private Long id;
    @ManyToMany(cascade = CascadeType.REMOVE)
    private List<Student> studentList = new ArrayList<Student>();
    @Constraints.Required
    private String name;
    @Constraints.Required
    private String department;
    @Constraints.Required
    private String information;
    @Constraints.Required
    private String guarantor;
    @Constraints.Required
    private String code;


    @ManyToMany(cascade = CascadeType.REMOVE)
    private List<Teacher> teachers = new ArrayList<Teacher>();
    
    @ManyToMany(cascade = CascadeType.REMOVE)
    private List<Homework> homeworks = new ArrayList<Homework>();

    public static Finder<Long, Subject> find = new Finder(Long.class, Subject.class);

    public Subject(String name, String code, String department, String guarantor, String information) {
        this.name = name;
        this.department = department;
        this.information = information;
        this.guarantor = guarantor;
        this.code = code;
    }

    public static void create(Subject subject){
        subject.save();
    }

    public static void delete(Long id){
        find.ref(id).delete();
    }

    public void copySubject(Long id){
        Subject oldSubject = Subject.find.byId(id);
        oldSubject.name = this.name;
        oldSubject.department = this.department;
        oldSubject.guarantor = this.guarantor;
        oldSubject.information = this.information;
        oldSubject.update();
    }
    public static Subject findByCode(String code){
        List<Subject> sublist = Subject.find.where().ilike("code", "%"+code+"%").findList();
        if(!sublist.isEmpty()){
            return sublist.get(0);
        }else{
            return null;
        }
    }

    public String getCode() {
        return code;
    }

    public static List<Subject> all(){
        return find.all();
    }

    public static List<String> getAllCodes(){
        List<String> codes = new ArrayList();
        for(Subject s : all()) {
            //if (!(codes.contains(e.subjectCode)))
            codes.add(s.code);
        }
        return codes;
    }


    public void setCode(String code) {
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getGuarantor() {
        return guarantor;
    }

    public void setGuarantor(String guarantor) {
        this.guarantor = guarantor;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    
    public List<Homework> getHomeworks() {
        return homeworks;
    }

    public void setHomeworks(List<Homework> homeworks) {
        this.homeworks = homeworks;
    }
    
    public void addHomework(Homework homework) {
        this.homeworks.add(homework);
    }
}
