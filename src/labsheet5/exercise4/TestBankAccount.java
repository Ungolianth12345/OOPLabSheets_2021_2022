package labsheet5.exercise4;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();

        String message = "Calling no-argument BankAccount constructor. The first BankAccount object details are:\n\n" + b1.toString();

        BankAccount b2 = new BankAccount("Richy Rich", 2, 0.75);

        message += "\n\nCalling multi-argument BankAccount constructor. The second BankAccount object details are:\n\n" + b2.toString();

        JOptionPane.showMessageDialog(null, message, "Test", JOptionPane.INFORMATION_MESSAGE);
    }
}
