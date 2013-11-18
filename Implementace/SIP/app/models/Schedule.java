package models;


import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: MacBook
 * Date: 17.11.13
 * Time: 16:47
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Schedule extends Model {

    @Id
    private Long id;

    @OneToOne
    private Student student;

    @ManyToMany
    private List<Subject> subject = new ArrayList<Subject>();

    public static Finder<Long, Schedule> find = new Finder(Long.class, Schedule.class);




}
