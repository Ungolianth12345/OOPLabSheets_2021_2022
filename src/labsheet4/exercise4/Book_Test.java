package labsheet4.exercise4;

import javax.swing.*;
import java.awt.*;

public class Book_Test {
    public static void main(String[] args) {
        String output = "";

        String ftitle = JOptionPane.showInputDialog("Please enter the title of your favorite book");
        double fprice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your favorite book"));
        String fisbn = JOptionPane.showInputDialog("Please enter the ISBN of your favorite book");
        int fpages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages of your favorite book"));

        Book favbook = new Book(ftitle, fprice, fisbn, fpages);

        output += "Calling the multi-argument Book constructor. " +
                "The first Book object details are: \n\n" + favbook.toString();

        /*String ltitle = JOptionPane.showInputDialog("Please enter the title of your least favorite book");
        double lprice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your least favorite book"));
        String lisbn = JOptionPane.showInputDialog("Please enter the ISBN of your least favorite book");
        int lpages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages of your least favorite book"));

        Book lbook = new Book(ltitle, lprice, lisbn, lpages);

        output += "\n\nCalling the multi-argument Book constructor. " +
                "The second Book object details are: \n\n" + lbook.toString();*/

        // for textarea use string.format + %s spacing in 25, 8, 15, ?? for the four columns

        Font font = new Font("monospaced", Font.PLAIN, 12);

        output += "Title\tPrice\tISBN\tPages" + favbook;

        JTextArea textArea = new JTextArea(output);

        textArea.setFont(font);

        textArea.append(output);

        JOptionPane.showMessageDialog(null,output,"Book " +
                "Data",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
