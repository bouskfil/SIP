package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: MacBook
 * Date: 17.11.13
 * Time: 16:59
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Task extends Model {

    @Id
    private Long id;

    @Constraints.Required
    private String name;
    @Constraints.Required
    private String description;

    @ManyToMany
    private List<Student> students = new ArrayList<Student>();

    public static Finder<Long, Task> find = new Finder(Long.class, Task.class);

}
