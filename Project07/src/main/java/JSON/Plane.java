
package JSON;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Plane {

    @SerializedName("planeCode")
    @Expose
    private String planeCode;
    @SerializedName("numOfSeats")
    @Expose
    private int numOfSeats;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Plane() {
    }

    /**
     * 
     * @param numOfSeats
     * @param planeCode
     */
    public Plane(String planeCode, int numOfSeats) {
        super();
        this.planeCode = planeCode;
        this.numOfSeats = numOfSeats;
    }

    public String getPlaneCode() {
        return planeCode;
    }

    public void setPlaneCode(String planeCode) {
        this.planeCode = planeCode;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Plane.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("planeCode");
        sb.append('=');
        sb.append(((this.planeCode == null)?"<null>":this.planeCode));
        sb.append(',');
        sb.append("numOfSeats");
        sb.append('=');
        sb.append(this.numOfSeats);
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
