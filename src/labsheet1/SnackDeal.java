package labsheet1;

import javax.swing.*;

public class SnackDeal {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your name");
        String course = JOptionPane.showInputDialog("Please enter your course");
        String snackNo = JOptionPane.showInputDialog("How many snacks would you like?");

        int snackNoAsInt = Integer.parseInt(snackNo);
        int cost = snackNoAsInt * 2;
        String message = String.format("Name: %s\nCourse: %s\nSnacks: %s\nCost: €%s", name, course, snackNo, cost);
        JOptionPane.showMessageDialog(null, message, "Receipt", JOptionPane.INFORMATION_MESSAGE);
    }
}
