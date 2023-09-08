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
    @SerializedName("Planes")
    @Expose
    private List<Plane> planes;
    @SerializedName("numOfFlights")
    @Expose
    private int numOfFlights = 0;
    @SerializedName("Flights")
    @Expose
    private List<Flight> flights;

    public Airline(String brandname, String code, int numOfPlanes, List<Plane> planes) {
        this.brandname = brandname;
        this.code = code;
        this.numOfPlanes = numOfPlanes;
        this.planes = planes;
    }

    public Airline() {
    }

    /**
     *
     * @param numOfPlanes
     * @param code
     * @param planes
     * @param numOfFlights
     * @param brandname
     * @param flights
     */
    public Airline(String brandname, String code, int numOfPlanes, List<Plane> planes, int numOfFlights, List<Flight> flights) {
        super();
        this.brandname = brandname;
        this.code = code;
        this.numOfPlanes = numOfPlanes;
        this.planes = planes;
        this.numOfFlights = numOfFlights;
        this.flights = flights;
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

    public List<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plane> planes) {
        this.planes = planes;
    }

    public int getNumOfFlights() {
        return numOfFlights;
    }

    public void setNumOfFlights(int numOfFlights) {
        this.numOfFlights = numOfFlights;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
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
        sb.append("planes");
        sb.append('=');
        sb.append(((this.planes == null) ? "<null>" : this.planes));
        sb.append(',');
        sb.append("numOfFlights");
        sb.append('=');
        sb.append(this.numOfFlights);
        sb.append(',');
        sb.append("flights");
        sb.append('=');
        sb.append(((this.flights == null) ? "<null>" : this.flights));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public double statisticize_turnOver(List<JSON.Flight> fl, int choose, int month, int year) {
        double turnOver = 0;
        for (JSON.Flight flight : fl) {
            if (choose == 1) { // tinh doanh thu theo thang
                if (flight.getArrivalTime().getDate().getYear() == year
                        && flight.getArrivalTime().getDate().getMonth() == month) {
                    turnOver += flight.getUsedEconomySeats() * flight.getEconomyFare()
                            + flight.getUsedBusinessSeats() * flight.getBusinessFare();
                }

            } else if (choose == 2) { // tinh doanh thu theo nam
                System.out.println(flight.getArrivalTime().getDate().getYear());
                System.out.println(year);
                if (flight.getArrivalTime().getDate().getYear() == year) {
                    turnOver += flight.getUsedEconomySeats() * flight.getEconomyFare()
                            + flight.getUsedBusinessSeats() * flight.getBusinessFare();
                }
            }
        }
        return turnOver;
    }

}
