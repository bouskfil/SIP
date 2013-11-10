package models;

/**
 * Created with IntelliJ IDEA.
 * User: MacBook
 * Date: 10.11.13
 * Time: 15:09
 * To change this template use File | Settings | File Templates.
 */
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User extends Model {

    @Id
    public String email;
    public String name;
    public String password;

    public User(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public static Finder<String,User> find = new Finder<String,User>(
            String.class, User.class
    );

    public static User authenticate(String email, String password) {
        return find.where().eq("email", email)
                .eq("password", password).findUnique();
    }
}