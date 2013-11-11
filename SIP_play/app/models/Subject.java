package models;

/**
 * Created with IntelliJ IDEA.
 * User: Filip Bouška
 * Date: 07.11.13
 * Time: 22:25
 */

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Subject extends Model{

    public interface All{}

    @Id
    public Long id;

    @Required(groups = {All.class})
    public String name;
    @Required(groups = {All.class})
    public String katedra;
    @Required(groups = {All.class})
    public String information;
    @Required(groups = {All.class})
    public String garant;
    @ManyToMany(cascade = CascadeType.REMOVE)
    public List<Teacher> teachers = new ArrayList<Teacher>();

    public static Finder<Long, Subject> find = new Finder(Long.class, Subject.class);


    public static void create(Subject subject){
        subject.save();
    }

    public static void delete(Long id){
        find.ref(id).delete();
    }

    public void copySubject(Long id){
        Subject oldSubject = Subject.find.byId(id);
        oldSubject.name = this.name;
        oldSubject.katedra = this.katedra;
        oldSubject.garant = this.garant;
        oldSubject.information = this.information;
        oldSubject.update();

    }

}
