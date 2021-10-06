package labsheet6.exercise1;

import javax.swing.*;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person();

        String message = "Calling the Person() constructor...\nValue of first Person object is: " + p1.toString();

        String firstName = JOptionPane.showInputDialog("Enter first name");
        String lastName = JOptionPane.showInputDialog("Enter last name");

        Person p2 = new Person(firstName, lastName);

        message += "\n\nCalling the Person(String, String) constructor...\nValue of second Person object is: " + p2.toString();

        JOptionPane.showMessageDialog(null, message, "Names", JOptionPane.INFORMATION_MESSAGE);
    }
}
