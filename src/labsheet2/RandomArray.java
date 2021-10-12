package labsheet2;

import javax.swing.*;
import java.util.Arrays;

public class RandomArray {
    private static void populateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*1000) + 1;
        }
    }

    public static void main(String[] args) {
        int overHundred = 0;
        String output = "";

        int[] arr = new int[10];

        populateArray(arr);

        output += "The initial contents of the array is:\n" + Arrays.toString(arr);

        for (int num: arr) {
            if (num > 100) {
                overHundred++;
            }
        }

        output += "\n\nThe percentage of numbers over 100 is " + overHundred*10 + "%\n\n";

        Arrays.sort(arr);

        output += "The contents of the array after sorting:\n" + Arrays.toString(arr);

        JOptionPane.showMessageDialog(null, output, "Array Stats", JOptionPane.INFORMATION_MESSAGE);
    }
}
