package labsheet1;

import javax.swing.*;

public class CyclistSponsor {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your name");
        String kmCycled = JOptionPane.showInputDialog("Please enter the number of km cycled");
        int kmCycledAsInt = Integer.parseInt(kmCycled);
        float amount;

        if (kmCycledAsInt <= 10f) {
            amount = kmCycledAsInt * 1.75f;
        } else {
            amount = (10 * 1.75f) + ((kmCycledAsInt - 10) * 2.5f);
        }

        String message = String.format("Name: %s\nDistance cycled: %s\nSponsorship amount due: €%.2f", name, kmCycled, amount);

        JOptionPane.showMessageDialog(null, message, "Receipt", JOptionPane.INFORMATION_MESSAGE);
    }
}
