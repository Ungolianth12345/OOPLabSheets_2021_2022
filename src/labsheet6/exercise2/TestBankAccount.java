package labsheet6.exercise2;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();

        String message = "Calling no-argument BankAccount constructor. The first BankAccount object details are:\n\n"
                + b1.toString();

        BankAccount b2 = new BankAccount("Richy Rich", 2, 0.75);

        message += "\n\nCalling multi-argument BankAccount constructor. The second BankAccount object details are:\n\n"
                + b2.toString();

        message += "\n\nNow calling the setInterestRate() method to change the interest rate to 0.5\n\n";

        BankAccount.setInterestRate(0.5);

        message += "The first BankAccount object details are:\n\n" + b1.toString()
                + "\n\nThe second BankAccount object details are:\n\n" + b2.toString();

        message += "\n\nThe number of created objects is: " + BankAccount.getCount();

        JOptionPane.showMessageDialog(null, message, "Test", JOptionPane.INFORMATION_MESSAGE);
    }
}
