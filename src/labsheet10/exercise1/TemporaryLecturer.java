package labsheet10.exercise1;

import java.util.GregorianCalendar;

public class TemporaryLecturer extends Lecturer {
    private int hoursWorked;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "TemporaryLecturer{" +
                "hoursWorked=" + hoursWorked +
                '}';
    }

    public TemporaryLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID, String[] coursesTaught, GregorianCalendar dateOfAppointment, int hoursWorked) {
        super(name, address, dateOfBirth, staffID, coursesTaught, dateOfAppointment);
        setHoursWorked(hoursWorked);
    }
}
