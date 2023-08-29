
package JSON;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListOfFlight {

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
    private double economyFare;
    @SerializedName("businessFare")
    @Expose
    private double businessFare;
    @SerializedName("totalEconomySeats")
    @Expose
    private int totalEconomySeats;
    @SerializedName("totalBusinessSeats")
    @Expose
    private int totalBusinessSeats;

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

    public double getEconomyFare() {
        return economyFare;
    }

    public void setEconomyFare(double economyFare) {
        this.economyFare = economyFare;
    }

    public double getBusinessFare() {
        return businessFare;
    }

    public void setBusinessFare(double businessFare) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListOfFlight.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
