package JSON;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Airline {

    @SerializedName("brandname")
    @Expose
    private String brandname;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("numOfPlanes")
    @Expose
    private int numOfPlanes;
    @SerializedName("listOfPlanes")
    @Expose
    private List<ListOfPlane> listOfPlanes;
    @SerializedName("numOfFlights")
    @Expose
    private int numOfFlights;
    @SerializedName("listOfFlights")
    @Expose
    private List<ListOfFlight> listOfFlights;

    public Airline(String brandname, String code, int numOfPlanes, List<ListOfPlane> listOfPlanes) {
        this.brandname = brandname;
        this.code = code;
        this.numOfPlanes = numOfPlanes;
        this.listOfPlanes = listOfPlanes;
        this.numOfFlights = 0;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNumOfPlanes() {
        return numOfPlanes;
    }

    public void setNumOfPlanes(int numOfPlanes) {
        this.numOfPlanes = numOfPlanes;
    }

    public List<ListOfPlane> getListOfPlanes() {
        return listOfPlanes;
    }

    public void setListOfPlanes(List<ListOfPlane> listOfPlanes) {
        this.listOfPlanes = listOfPlanes;
    }

    public int getNumOfFlights() {
        return numOfFlights;
    }

    public void setNumOfFlights(int numOfFlights) {
        this.numOfFlights = numOfFlights;
    }

    public List<ListOfFlight> getListOfFlights() {
        return listOfFlights;
    }

    public void setListOfFlights(List<ListOfFlight> listOfFlights) {
        this.listOfFlights = listOfFlights;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Airline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("brandname");
        sb.append('=');
        sb.append(((this.brandname == null) ? "<null>" : this.brandname));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null) ? "<null>" : this.code));
        sb.append(',');
        sb.append("numOfPlanes");
        sb.append('=');
        sb.append(this.numOfPlanes);
        sb.append(',');
        sb.append("listOfPlanes");
        sb.append('=');
        sb.append(((this.listOfPlanes == null) ? "<null>" : this.listOfPlanes));
        sb.append(',');
        sb.append("numOfFlights");
        sb.append('=');
        sb.append(this.numOfFlights);
        sb.append(',');
        sb.append("listOfFlights");
        sb.append('=');
        sb.append(((this.listOfFlights == null) ? "<null>" : this.listOfFlights));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
