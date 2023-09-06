
package JSON;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Airport {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("city")
    @Expose
    private String city;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Airport() {
    }

    /**
     * 
     * @param city
     * @param name
     */
    public Airport(String name, String city) {
        super();
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Airport .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
