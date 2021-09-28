package labsheet1;

import javax.swing.*;

public class HeightStats {
    public static void main(String[] args) {
        int loop = 1;
        float total = 0f;
        float smallest = 2.72f;
        int middle = 0;
        float above = 0f;

        while(loop <=6) {
            String input = JOptionPane.showInputDialog("Loop " + loop + " - Please enter height");
            float inputAsFloat = Float.parseFloat(input);
            while (inputAsFloat < 0.5464 || inputAsFloat > 2.72) {
                input = JOptionPane.showInputDialog("Loop " + loop + " - Height value invalid!!! Please re-enter height");
                inputAsFloat = Float.parseFloat(input);
            }
            total += inputAsFloat;
            if (inputAsFloat < smallest) {
                smallest = inputAsFloat;
            }
            if (inputAsFloat < 1.9 && inputAsFloat > 1.3) {
                middle++;
            }
            if (inputAsFloat > 1.665) {
                above += 1.0f;
            }
            loop += 1;
        }

        String message = String.format("""
                        The average of the heights entered is %.1f
                        The smallest height value entered is %.2f
                        The number of height values between 1.3m and 1.9m inclusive is %d
                        The percentage of height values exceeding the global average height is %.2f%%""",
                total/6, smallest, middle, (above/6)*100);
        JOptionPane.showMessageDialog(null, message, "Height Statistics", JOptionPane.INFORMATION_MESSAGE);
    }
}
