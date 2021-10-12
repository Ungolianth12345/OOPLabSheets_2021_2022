package labsheet2;

import javax.swing.JOptionPane;

public class ComputerData {
    public static void main(String[] args)
    {
        int hardDiskSpace = 0;
        int numProcessed = 0;
        int totalDiskSpace = 0;
        float price, cheap = 0, expensive = 0;
        String serialNumber;
        String processorType;
        String processorTypeCheapest = "";
        String hardDiskSpaceAsString, priceAsString;
        boolean valid;

        serialNumber = JOptionPane.showInputDialog("Please enter the serial number "
                + "(<CR> to exit)");

        while(!serialNumber.equals("")) {
            hardDiskSpaceAsString = JOptionPane.showInputDialog("Please enter the hard-disk space");

            valid = false;

            while(!valid) {
                int i;
                for (i = 0; i < hardDiskSpaceAsString.length(); i++)
                    if (!Character.isDigit(hardDiskSpaceAsString.charAt(i)))
                        break;

                    if (i < hardDiskSpaceAsString.length())
                        hardDiskSpaceAsString = JOptionPane.showInputDialog("Invalid! Please re-enter hard-disk space");

                    else {
                        hardDiskSpace = Integer.parseInt(hardDiskSpaceAsString);

                        if (hardDiskSpace > 50 && hardDiskSpace < 5000) {
                            valid = true;
                        } else {
                            hardDiskSpaceAsString = JOptionPane.showInputDialog("Invalid! Please re-enter hard-disk space");
                        }
                    }
            }
            processorType = JOptionPane.showInputDialog("Please enter the processor type");

            priceAsString = JOptionPane.showInputDialog("Please enter the price");
            price = Float.parseFloat(priceAsString);

            numProcessed++;

            if (numProcessed == 1) {
                cheap = price;
                expensive = price;
                processorTypeCheapest = processorType;
            } else if (price < cheap) {
                cheap = price;
                processorTypeCheapest = processorType;
            } else if (price > expensive) {
                expensive = price;
            }

            totalDiskSpace += hardDiskSpace;

            serialNumber = JOptionPane.showInputDialog("Please enter the serial number "
                    + "(<CR> to exit)");
        }
        if (numProcessed > 0) {

            int averageDiskSpace = totalDiskSpace/numProcessed;

            String message = String.format("The average disk space available on the computers processed is: %d GB" +
                    "\nThe price range of the computers is from €%.2f to €%.2f" +
                    "\nThe processor type on the cheapest computer is %s",
                    averageDiskSpace, cheap, expensive, processorTypeCheapest);

            JOptionPane.showMessageDialog(null, message, "Computer Stats", JOptionPane.INFORMATION_MESSAGE);
        }

        else {
            JOptionPane.showMessageDialog(null, "No data entered!",
                    "Computer Data", JOptionPane.WARNING_MESSAGE);
        }
        System.exit(0);
    }
}