
package sample.serialization.pojos;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Addreess {
 @SerializedName("streetName")
    @Expose
    private String street3Name;
    @SerializedName("state")
    @Expose
    private String sta2te;
    @SerializedName("country")
    @SerializedName("streetName")
    @Expose
    private String stree5tName;
    @SerializedName("state")
    @Exposegit 
    private String state;
    @SerializedName("country")
    @Expose
    private String country;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
