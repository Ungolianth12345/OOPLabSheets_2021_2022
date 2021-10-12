package labsheet2;

import javax.swing.*;

public class NumbersArray {
    public static double largest(double[] array) {
        double largest = array[0];
        for (double arr : array) {
            if (arr > largest) {
                largest = arr;
            }
        }
        return largest;
    }

    public static double average(double[] array) {
        double total = 0;
        for (double num : array) {
            total += num;
        }
        return total/array.length;
    }

    public static String aboveAverage(double[] array, double average) {
        StringBuilder listAboveAverage = new StringBuilder();

        for (double arr : array) {
            if (arr > average) {
                listAboveAverage.append(arr).append(" ");
            }
        }

        return listAboveAverage.toString();
    }

    public static void main(String[] args) {
        double[] arr = {22.3, 45.6, 27.4, 56.6, 73.2, 11.5, 87.4, 23.8};
        String message = String.format("The largest value in the array is %.2f" +
                "\nThe average value in the array is %.3f\nThe list of values above the average is: %s",
                largest(arr), average(arr), aboveAverage(arr, average(arr)));

        JOptionPane.showMessageDialog(null, message, "Doubles", JOptionPane.INFORMATION_MESSAGE);
    }
}
