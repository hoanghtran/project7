
package JSON;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Flight {

    @SerializedName("flightCode")
    @Expose
    private String flightCode;
    @SerializedName("planeCode")
    @Expose
    private String planeCode;
    @SerializedName("departureTime")
    @Expose
    private DepartureTime departureTime;
    @SerializedName("arrivalTime")
    @Expose
    private ArrivalTime arrivalTime;
    @SerializedName("departure")
    @Expose
    private String departure;
    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("usedEconomySeats")
    @Expose
    private int usedEconomySeats;
    @SerializedName("usedBusinessSeats")
    @Expose
    private int usedBusinessSeats;
    @SerializedName("economyFare")
    @Expose
    private int economyFare;
    @SerializedName("businessFare")
    @Expose
    private int businessFare;
    @SerializedName("totalEconomySeats")
    @Expose
    private int totalEconomySeats;
    @SerializedName("totalBusinessSeats")
    @Expose
    private int totalBusinessSeats;
    @SerializedName("numOfPassengers")
    @Expose
    private int numOfPassengers;
    @SerializedName("numOfBusiness")
    @Expose
    private int numOfBusiness;
    @SerializedName("numOfEconomic")
    @Expose
    private int numOfEconomic;
    @SerializedName("Seats")
    @Expose
    private List<Seat> seats;
    @SerializedName("Passengers")
    @Expose
    private List<Passenger> passengers;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Flight() {
    }

    /**
     * 
     * @param departureTime
     * @param economyFare
     * @param totalBusinessSeats
     * @param passengers
     * @param numOfEconomic
     * @param flightCode
     * @param destination
     * @param usedBusinessSeats
     * @param usedEconomySeats
     * @param seats
     * @param businessFare
     * @param arrivalTime
     * @param numOfBusiness
     * @param planeCode
     * @param numOfPassengers
     * @param departure
     * @param totalEconomySeats
     */
    public Flight(String flightCode, String planeCode, DepartureTime departureTime, ArrivalTime arrivalTime, String departure, String destination, int usedEconomySeats, int usedBusinessSeats, int economyFare, int businessFare, int totalEconomySeats, int totalBusinessSeats, int numOfPassengers, int numOfBusiness, int numOfEconomic, List<Seat> seats, List<Passenger> passengers) {
        super();
        this.flightCode = flightCode;
        this.planeCode = planeCode;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departure = departure;
        this.destination = destination;
        this.usedEconomySeats = usedEconomySeats;
        this.usedBusinessSeats = usedBusinessSeats;
        this.economyFare = economyFare;
        this.businessFare = businessFare;
        this.totalEconomySeats = totalEconomySeats;
        this.totalBusinessSeats = totalBusinessSeats;
        this.numOfPassengers = numOfPassengers;
        this.numOfBusiness = numOfBusiness;
        this.numOfEconomic = numOfEconomic;
        this.seats = seats;
        this.passengers = passengers;
    }

    public Flight(String flightCode, String planeCode, DepartureTime departureTime, ArrivalTime arrivalTime, String departure, String destination, int economyFare, int businessFare, int totalEconomySeats, int totalBusinessSeats) {
        this.flightCode = flightCode;
        this.planeCode = planeCode;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departure = departure;
        this.destination = destination;
        this.economyFare = economyFare;
        this.businessFare = businessFare;
        this.totalEconomySeats = totalEconomySeats;
        this.totalBusinessSeats = totalBusinessSeats;
    }
    
    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getPlaneCode() {
        return planeCode;
    }

    public void setPlaneCode(String planeCode) {
        this.planeCode = planeCode;
    }

    public DepartureTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(DepartureTime departureTime) {
        this.departureTime = departureTime;
    }

    public ArrivalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(ArrivalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getUsedEconomySeats() {
        return usedEconomySeats;
    }

    public void setUsedEconomySeats(int usedEconomySeats) {
        this.usedEconomySeats = usedEconomySeats;
    }

    public int getUsedBusinessSeats() {
        return usedBusinessSeats;
    }

    public void setUsedBusinessSeats(int usedBusinessSeats) {
        this.usedBusinessSeats = usedBusinessSeats;
    }

    public int getEconomyFare() {
        return economyFare;
    }

    public void setEconomyFare(int economyFare) {
        this.economyFare = economyFare;
    }

    public int getBusinessFare() {
        return businessFare;
    }

    public void setBusinessFare(int businessFare) {
        this.businessFare = businessFare;
    }

    public int getTotalEconomySeats() {
        return totalEconomySeats;
    }

    public void setTotalEconomySeats(int totalEconomySeats) {
        this.totalEconomySeats = totalEconomySeats;
    }

    public int getTotalBusinessSeats() {
        return totalBusinessSeats;
    }

    public void setTotalBusinessSeats(int totalBusinessSeats) {
        this.totalBusinessSeats = totalBusinessSeats;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public int getNumOfBusiness() {
        return numOfBusiness;
    }

    public void setNumOfBusiness(int numOfBusiness) {
        this.numOfBusiness = numOfBusiness;
    }

    public int getNumOfEconomic() {
        return numOfEconomic;
    }

    public void setNumOfEconomic(int numOfEconomic) {
        this.numOfEconomic = numOfEconomic;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Flight.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("flightCode");
        sb.append('=');
        sb.append(((this.flightCode == null)?"<null>":this.flightCode));
        sb.append(',');
        sb.append("planeCode");
        sb.append('=');
        sb.append(((this.planeCode == null)?"<null>":this.planeCode));
        sb.append(',');
        sb.append("departureTime");
        sb.append('=');
        sb.append(((this.departureTime == null)?"<null>":this.departureTime));
        sb.append(',');
        sb.append("arrivalTime");
        sb.append('=');
        sb.append(((this.arrivalTime == null)?"<null>":this.arrivalTime));
        sb.append(',');
        sb.append("departure");
        sb.append('=');
        sb.append(((this.departure == null)?"<null>":this.departure));
        sb.append(',');
        sb.append("destination");
        sb.append('=');
        sb.append(((this.destination == null)?"<null>":this.destination));
        sb.append(',');
        sb.append("usedEconomySeats");
        sb.append('=');
        sb.append(this.usedEconomySeats);
        sb.append(',');
        sb.append("usedBusinessSeats");
        sb.append('=');
        sb.append(this.usedBusinessSeats);
        sb.append(',');
        sb.append("economyFare");
        sb.append('=');
        sb.append(this.economyFare);
        sb.append(',');
        sb.append("businessFare");
        sb.append('=');
        sb.append(this.businessFare);
        sb.append(',');
        sb.append("totalEconomySeats");
        sb.append('=');
        sb.append(this.totalEconomySeats);
        sb.append(',');
        sb.append("totalBusinessSeats");
        sb.append('=');
        sb.append(this.totalBusinessSeats);
  /*    sb.append(',');
        sb.append("numOfPassengers");
        sb.append('=');
        sb.append(this.numOfPassengers);
        sb.append(',');
        sb.append("numOfBusiness");
        sb.append('=');
        sb.append(this.numOfBusiness);
        sb.append(',');
        sb.append("numOfEconomic");
        sb.append('=');
        sb.append(this.numOfEconomic);
        sb.append(',');
        sb.append("seats");
        sb.append('=');
        sb.append(((this.seats == null)?"<null>":this.seats));
        sb.append(',');
        sb.append("passengers");
        sb.append('=');
        sb.append(((this.passengers == null)?"<null>":this.passengers));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }*/
        return sb.toString();
    }
    
}
