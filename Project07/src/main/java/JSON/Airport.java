
package JSON;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Airport {

    @SerializedName("airports")
    @Expose
    private List<Airport__1> airports;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Airport() {
    }

    /**
     * 
     * @param airports
     */
    public Airport(List<Airport__1> airports) {
        super();
        this.airports = airports;
    }

    public List<Airport__1> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport__1> airports) {
        this.airports = airports;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Airport.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("airports");
        sb.append('=');
        sb.append(((this.airports == null)?"<null>":this.airports));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
