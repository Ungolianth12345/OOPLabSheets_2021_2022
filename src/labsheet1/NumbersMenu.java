package labsheet1;

import javax.swing.*;

public class NumbersMenu {
    public static String parity(int input) {
        return ( input % 2 == 1 ) ? "This number is odd" : "This number is even";
    }

    public static double factorial(int input) {
        double result = 1;
        for ( int factor = 1; factor <= input; factor++ ) {
            result *= factor;
        }
        return result;
    }

    public static void main(String[] args) {
        int counter = 10;
        do {
            String iter = "Iteration " + (11-counter) + "\n\nPlease enter a number";
            int num = Integer.parseInt(JOptionPane.showInputDialog(iter));
            int option = Integer.parseInt(JOptionPane.showInputDialog("What would you like to do with number " + num +
                    "?\n\n1. Determine if the number is odd or even\n2. Find the factorial of the number\n" +
                    "3. Quit the program"));
            switch (option) {
                case 1 -> {
                    JOptionPane.showMessageDialog(null, parity(num), "Result", JOptionPane.INFORMATION_MESSAGE);
                    counter--;
                    continue;
                }
                case 2 -> {
                    if (num < 0) {
                        JOptionPane.showMessageDialog(null, "Negative numbers are invalid for factorialization!");
                    } else {
                        JOptionPane.showMessageDialog(null, factorial(num), "Result", JOptionPane.INFORMATION_MESSAGE);
                    } counter--;
                    continue;
                } case 3 -> {
                    JOptionPane.showMessageDialog(null, "Quitting program earlier than expected...", "Goodbye", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
            }
        } while (counter >= 1);
    }
}
