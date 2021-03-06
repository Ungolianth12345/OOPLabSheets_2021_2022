package labsheet10.exercise1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TemporaryLecturer extends Lecturer {
    private int hoursWorked;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getStatus(){
        return "Contracted temporary lecturer on part-time hours";
    }

    public int getPointOnScale() {
        Calendar today = Calendar.getInstance();
        int yearsWorked = today.get(Calendar.YEAR) - getDateOfAppointment().get(Calendar.YEAR);

        if(today.get(Calendar.MONTH)<getDateOfAppointment().get(Calendar.MONTH)
                || (today.get(Calendar.MONTH)==getDateOfAppointment().get(Calendar.MONTH)
                && today.get(Calendar.DATE)<getDateOfAppointment().get(Calendar.DATE)))
            yearsWorked--;

        if (yearsWorked >= 3 && hoursWorked > 1500)
            return 4;
        else if (yearsWorked >= 3 && hoursWorked > 1000)
            return (int)Math.floor(((getHoursWorked()*1.33)/700)+1);
        else
            return yearsWorked;
    }

    public String toString(){
        return super.toString() + "\nLecturer Hours Worked: " + getHoursWorked();
    }

    public TemporaryLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID, String[] coursesTaught, GregorianCalendar dateOfAppointment, int hoursWorked) {
        super(name, address, dateOfBirth, staffID, coursesTaught, dateOfAppointment);
        setHoursWorked(hoursWorked);
    }
}
