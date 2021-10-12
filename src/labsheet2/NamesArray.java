package labsheet2;

import javax.swing.*;
import java.util.Arrays;

public class NamesArray {
    public static void populateArray(String[] names) {
        for (int i = 0; i < names.length; i++) {
            names[i] = JOptionPane.showInputDialog("Enter a name");
        }
    }

    public static void main(String[] args) {
        double average = 0.00;
        String longestName = "";

        String[] names = new String[5];

        populateArray(names);

        for (int i = 0; i < names.length; i++) {
            average += names[i].length();

            if (names[i].length() > longestName.length()) {
                longestName = names[i];
            }
        }

        Arrays.sort(names);

        JOptionPane.showMessageDialog(null, "Longest name: " + longestName +
                "\nAverage amount of characters: " + average/names.length + "\nSorted names:\n\n" +
                Arrays.toString(names));
    }
}
