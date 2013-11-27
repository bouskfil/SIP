package models;

/**
 * Created with IntelliJ IDEA.
 * User: Filip Bouška
 * Date: 07.11.13
 * Time: 22:25
 */

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Teacher extends Model{

    @Id
    public Long id;

    @Required
    public String name;

    public static Finder<Long, Teacher> find = new Finder(Long.class, Teacher.class);

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
    

}
