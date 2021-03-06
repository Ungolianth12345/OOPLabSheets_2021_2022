package labsheet10.exercise1;

import java.util.Calendar;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPointOnScale() {
        Calendar today = Calendar.getInstance();
        int yearsWorked = today.get(Calendar.YEAR) - getDateOfAppointment().get(Calendar.YEAR);

        if(today.get(Calendar.MONTH)<getDateOfAppointment().get(Calendar.MONTH)
                || (today.get(Calendar.MONTH)==getDateOfAppointment().get(Calendar.MONTH)
                && today.get(Calendar.DATE)<getDateOfAppointment().get(Calendar.DATE)))
            yearsWorked--;

        return Math.min(yearsWorked, 20);
    }

    public String toString() {
        return super.toString() + "\nLecturer Pension Entitlements: " + getPensionEntitlements();
    }

    public PermanentLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID,
                             String[] coursesTaught, GregorianCalendar dateOfAppointment, String pensionEntitlements,
                             String status) {
        super(name, address, dateOfBirth, staffID, coursesTaught, dateOfAppointment);
        this.pensionEntitlements = pensionEntitlements;
        this.status = status;
    }
}
