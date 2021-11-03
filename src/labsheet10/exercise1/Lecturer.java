package labsheet10.exercise1;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class Lecturer implements Person {
    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;
    private String staffID;
    private String[] coursesTaught;
    private GregorianCalendar dateOfAppointment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public GregorianCalendar getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(GregorianCalendar dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    // abstract method
    public String getStatus() {
        return "Status";
    }

    // abstract method
    public int getPointOnScale() {
        return 0;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", staffID='" + getStaffID() + '\'' +
                ", coursesTaught=" + Arrays.toString(coursesTaught) +
                ", dateOfAppointment=" + getDateOfAppointment() +
                '}';
    }

    public Lecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID, String[] coursesTaught, GregorianCalendar dateOfAppointment) {
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
        setStaffID(staffID);
        setCoursesTaught(coursesTaught);
        setDateOfAppointment(dateOfAppointment);
    }
}
