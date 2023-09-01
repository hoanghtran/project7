
package JSON;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Date__1 {

    @SerializedName("year")
    @Expose
    private int year;
    @SerializedName("month")
    @Expose
    private int month;
    @SerializedName("day")
    @Expose
    private int day;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Date__1() {
    }

    /**
     * 
     * @param month
     * @param year
     * @param day
     */
    public Date__1(int year, int month, int day) {
        super();
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Date__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("year");
        sb.append('=');
        sb.append(this.year);
        sb.append(',');
        sb.append("month");
        sb.append('=');
        sb.append(this.month);
        sb.append(',');
        sb.append("day");
        sb.append('=');
        sb.append(this.day);
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
