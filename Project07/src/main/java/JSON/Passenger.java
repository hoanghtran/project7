package JSON;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Passenger {

    @SerializedName("ID")
    @Expose
    private String id;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("ticketCode")
    @Expose
    private String ticketCode;

    /**
     * No args constructor for use in serialization
     *
     */
    public Passenger() {
    }

    /**
     *
     * @param fullName
     * @param id
     * @param ticketCode
     */
    public Passenger(String id, String fullName, String ticketCode) {
        super();
        this.id = id;
        this.fullName = fullName;
        this.ticketCode = ticketCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    

    @Override
    public String toString() {
        return "Passenger{" + "id=" + id + ", fullName=" + fullName + ", ticketCode=" + ticketCode + '}';
    }
    

}
