
package JSON;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Seat {

    @SerializedName("SeatCode")
    @Expose
    private String seatCode;
    @SerializedName("Status")
    @Expose
    private int status;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Seat() {
    }

    /**
     * 
     * @param seatCode
     * @param status
     */
    public Seat(String seatCode, int status) {
        super();
        this.seatCode = seatCode;
        this.status = status;
    }

    public String getSeatCode() {
        return seatCode;
    }

    public void setSeatCode(String seatCode) {
        this.seatCode = seatCode;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Seat.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seatCode");
        sb.append('=');
        sb.append(((this.seatCode == null)?"<null>":this.seatCode));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(this.status);
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
