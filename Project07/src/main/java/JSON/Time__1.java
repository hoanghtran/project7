
package JSON;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Time__1 {

    @SerializedName("hour")
    @Expose
    private int hour;
    @SerializedName("minute")
    @Expose
    private int minute;
    @SerializedName("second")
    @Expose
    private int second;
    @SerializedName("nano")
    @Expose
    private int nano;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getNano() {
        return nano;
    }

    public void setNano(int nano) {
        this.nano = nano;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Time__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hour");
        sb.append('=');
        sb.append(this.hour);
        sb.append(',');
        sb.append("minute");
        sb.append('=');
        sb.append(this.minute);
        sb.append(',');
        sb.append("second");
        sb.append('=');
        sb.append(this.second);
        sb.append(',');
        sb.append("nano");
        sb.append('=');
        sb.append(this.nano);
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
