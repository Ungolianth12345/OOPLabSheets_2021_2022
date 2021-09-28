package labsheet1;

import javax.swing.*;

public class PlanetGravity {
    public static void main(String[] args) {
        double earthMass = Double.parseDouble(JOptionPane.showInputDialog("Please enter the mass of planet Earth"));
        double earthRadius = Double.parseDouble(JOptionPane.showInputDialog("Please enter the radius of planet Earth"));
        double otherMass = Double.parseDouble(JOptionPane.showInputDialog("Please enter the mass of the other planet"));
        double otherRadius = Double.parseDouble(JOptionPane.showInputDialog("Please enter the radius of the other planet"));
        final float G = 9.81f;

        double accel = (G * otherMass * earthRadius * earthRadius) / (earthMass * otherRadius * otherRadius);

        JOptionPane.showMessageDialog(null, String.format("The acceleration due to gravity on the other planet is %.2f m/s/s", accel), "Acceleration", JOptionPane.INFORMATION_MESSAGE);
    }
}
