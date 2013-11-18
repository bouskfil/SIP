package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: MacBook
 * Date: 17.11.13
 * Time: 17:00
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class Address extends Model {

    @Id
    private Long id;

    @Constraints.Required
    private String city;
    @Constraints.Required
    private int postcode;
    @Constraints.Required
    private String street;

    public static Finder<Long, Address> find = new Finder(Long.class, Address.class);

    public static void create(Address address){
        address.save();
    }

    public static void delete(Long id){
        find.ref(id).delete();
    }


    //<editor-fold desc="getters and setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    //</editor-fold>
}
