package labsheet10.exercise1;

import java.util.GregorianCalendar;

public class PermanentLecturer extends Lecturer {
    private String pensionEntitlements;
    private String status;

    public String getPensionEntitlements() {
        return pensionEntitlements;
    }

    public void setPensionEntitlements(String pensionEntitlements) {
        this.pensionEntitlements = pensionEntitlements;
    }

    @Override
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // implement getPointOnScale


    @Override
    public String toString() {
        return "PermanentLecturer{" +
                "pensionEntitlements='" + pensionEntitlements + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public PermanentLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID,
                             String[] coursesTaught, GregorianCalendar dateOfAppointment, String pensionEntitlements,
                             String status) {
        super(name, address, dateOfBirth, staffID, coursesTaught, dateOfAppointment);
        this.pensionEntitlements = pensionEntitlements;
        this.status = status;
    }
}
