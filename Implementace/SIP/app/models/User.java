package models;

/**
 * Created with IntelliJ IDEA.
 * User: Filip Bouška
 * Date: 07.11.13
 * Time: 22:25
 */

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import play.data.validation.Constraints.*;
import play.db.ebean.Model;
import javax.validation.*;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User extends Model {
    
    public interface All{}
    public interface Step1{}

    @Id
    @Required(groups = {All.class, Step1.class})
    @Email(groups = {All.class, Step1.class})
    public String email;
    
    @Required(groups = {All.class, Step1.class})
    public String name;
    
    @Required(groups = {All.class, Step1.class})
    @MinLength(value = 6, groups = {All.class, Step1.class})
    public String password;

    public User(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public static Finder<String,User> find = new Finder<String,User>(
            String.class, User.class
    );
    
    public static void create(User user){
        user.save();
    }

    public static User authenticate(String email, String password) {
        return find.where().eq("email", email)
                .eq("password", password).findUnique();
    }
}