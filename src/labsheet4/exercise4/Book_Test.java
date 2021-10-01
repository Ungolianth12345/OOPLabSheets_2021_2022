package labsheet4.exercise4;

import javax.swing.*;
import java.awt.*;

public class Book_Test {
    public static String book_format(String a, double b, String c, int d) {
        return String.format("%-25s%-8s%-13s%s", a, b, c, d + "\n\n");
    }

    public static void main(String[] args) {
        String output = "";

        String ftitle = JOptionPane.showInputDialog("Please enter the title of your favorite book");
        double fprice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your favorite book"));
        String fisbn = JOptionPane.showInputDialog("Please enter the ISBN of your favorite book");
        int fpages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages of your favorite book"));

        Book favbook = new Book(ftitle, fprice, fisbn, fpages);

        String ltitle = JOptionPane.showInputDialog("Please enter the title of your least favorite book");
        double lprice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your least favorite book"));
        String lisbn = JOptionPane.showInputDialog("Please enter the ISBN of your least favorite book");
        int lpages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages of your least favorite book"));

        Book lbook = new Book(ltitle, lprice, lisbn, lpages);

        // for textarea use string.format + %s spacing in 25, 8, 15, ?? for the four columns

        Font font = new Font("monospaced", Font.PLAIN, 12);

        String header = String.format("%-25s%-8s%-13s%s", "Title", "Price", "ISBN", "Pages\n\n");

        output += header;

        output += book_format(favbook.getTitle(), favbook.getPrice(), favbook.getIsbn(), favbook.getPages());

        output += book_format(lbook.getTitle(), lbook.getPrice(), lbook.getIsbn(), lbook.getPages());

        JTextArea textArea = new JTextArea(5, 20);

        textArea.setFont(font);

        textArea.append(output);

        JOptionPane.showMessageDialog(null, textArea,"Book " +
            "Data",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
