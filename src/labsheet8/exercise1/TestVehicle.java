package labsheet8.exercise1;

import javax.swing.*;

public class TestVehicle {
    public static void main(String[] args) {
        Car c1 = new Car();

        String message = "Testing the Car no-arg constructor:\n\n" + c1;

        Car c2 = new Car(1000000.0, 4.5, 1.25, 2000.0, "Ferrari", "F2",
                2, "05KY1");

        message += "\nTesting the Car multi-arg constructor: \n\n" + c2;

        Bicycle b1 = new Bicycle();

        message += "\nTesting the Bicycle no-arg constructor:\n\n" + b1;

        Bicycle b2 = new Bicycle(500.0, 1.5, 1.0, 50.0, "Relaigh",
                "Mountainbike", 4, true);

        message += "\nTesting the Bicycle multi-arg constructor:\n\n" + b2;

        JOptionPane.showMessageDialog(null, message);
    }
}
