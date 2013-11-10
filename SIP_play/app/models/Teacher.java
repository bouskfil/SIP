package models;

/**
 * Created with IntelliJ IDEA.
 * User: MacBook
 * Date: 07.11.13
 * Time: 22:25
 * To change this template use File | Settings | File Templates.
 */


import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
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


}
