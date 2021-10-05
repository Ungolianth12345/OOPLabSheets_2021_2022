package labsheet5.exercise3;

import javax.swing.*;

public class TestThermometer {
    public static void main(String[] args) {
        Thermometer t1 = new Thermometer(35);

        String message = "Calling single-argument constructor, First thermometer:\n" + t1.toString();

        Thermometer t2 = new Thermometer();

        message += "\n\nCalling no-argument constructor, Second thermometer\n" + t2.toString();

        t2.setTemperature(25);

        message += "\n\nCalling setTemperate(25) on second thermometer: \n" + t2.toString();

        System.out.println(t2.getMinTemp());

        JOptionPane.showMessageDialog(null, message, "Thermometer Data", JOptionPane.INFORMATION_MESSAGE);

        int input = Integer.parseInt(JOptionPane.showInputDialog("Please enter the current temperature of the second thermometer"));

        t1.setTemperature(input);

        String message2 = "Calling setTemperate(), setting temperature of first thermometer to " + input + "C\n\n" + t1.toString();

        JOptionPane.showMessageDialog(null, message2, "Thermometer Testing", JOptionPane.INFORMATION_MESSAGE);
    }
}
