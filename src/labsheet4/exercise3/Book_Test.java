package labsheet4.exercise3;

import javax.swing.*;

public class Book_Test {
    public static void main(String[] args) {
        String output = "";

        Book b1 = new Book();

        output += "Calling the no-argument Book constructor. " +
                "The first Book object details are: \n\n" + b1.toString();

        Book b2 = new Book("The DaVinci Code", 19.99, "3452617232", 348);

        output += "\n\nCalling the multi-argument Book constructor. " +
                "The second Book object details are: \n\n" + b2.toString();

        JOptionPane.showMessageDialog(null,output,"Book " +
                "Data",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
