package models;

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
    private Long id;

    private Date date;

    @ManyToMany
    private List<Student> students = new ArrayList<Student>();
}
