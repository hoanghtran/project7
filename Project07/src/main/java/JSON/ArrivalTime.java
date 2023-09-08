
package JSON;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArrivalTime {

    @SerializedName("date")
    @Expose
    private Date__1 date;
    @SerializedName("time")
    @Expose
    private Time__1 time;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ArrivalTime() {
    }

    /**
     * 
     * @param date
     * @param time
     */
    public ArrivalTime(Date__1 date, Time__1 time) {
        super();
        this.date = date;
        this.time = time;
    }

    public Date__1 getDate() {
        return date;
    }

    public void setDate(Date__1 date) {
        this.date = date;
    }

    public Time__1 getTime() {
        return time;
    }

    public void setTime(Time__1 time) {
        this.time = time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //sb.append(ArrivalTime.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
