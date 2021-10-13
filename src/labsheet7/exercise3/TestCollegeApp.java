package labsheet7.exercise3;

import javax.swing.*;

public class TestCollegeApp {
    public static void main(String[] args) {
        Student student1 = new Student(154345, "Jake", "Computing");
        Student student2 = new Student(234532, "Mary", "Creative Media");
        Student student3 = new Student(453726, "Tommy", "Computing");
        Student student4 = new Student(623456, "Peter", "Creative Media");

        Student[] computingStudents = new Student[10];
        Student[] creativeMediaStudents = new Student[10];

        computingStudents[0] = student1;
        computingStudents[1] = student3;

        creativeMediaStudents[0] = student2;
        creativeMediaStudents[1] = student4;

        Department computing = new Department("Computing", computingStudents);
        Department creativeMedia = new Department("Computing", creativeMediaStudents);

        Department[] department = new Department[5];

        department[0] = computing;
        department[1] = creativeMedia;

        Institute itt = new Institute("Institute of Technology, Tralee", department);

        JOptionPane.showMessageDialog(null, itt.toString());

        String total = "Total number of students: " + itt.getTotalStudents();

        JOptionPane.showMessageDialog(null, total, "Total number of students", JOptionPane.INFORMATION_MESSAGE);
    }
}
