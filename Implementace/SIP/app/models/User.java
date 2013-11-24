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
import play.data.validation.Constraints;
import play.db.ebean.Model;
import javax.validation.*;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User extends Model {
        
    @Id
    @Constraints.Required
    @Constraints.Email
    private String email;
    
    @Constraints.Required
    private String name;
    
    @Constraints.Required
    private String lastName;
    
    @Constraints.Required
    @Constraints.MinLength(value = 6)
    private String password;
    
    @Constraints.Required
    private String userRole;    
   

    public User(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }
    public User(String email, String name, String lastName, String password, String userRole) {
        this.email = email;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.userRole = userRole;
    }
    
    public String getEmail(){
        return email;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public String getUserRole(){
        return userRole;
    }
    public String getPassword(){
        return password;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setUserRole(String userRole){
        this.userRole=userRole;
    }
    public void setPassword(String password){
        this.password=password;
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
    public static List<String> getUserRoles(){
        List <String> list=new ArrayList<String>();
        list.add("admin");
        list.add("student");
        list.add("teacher");
        
        return list;
    }
}