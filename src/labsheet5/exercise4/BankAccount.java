package labsheet5.exercise4;

public class BankAccount {
    private String owner;
    private int number;
    private static double interestRate;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public String toString() {
        return "Owner: " + getOwner() + " Number: " +
                getNumber() + " Interest Rate: " + getInterestRate();
    }

    public BankAccount() {
        this("Owner not available", 0, 0);
    }

    public BankAccount(String owner, int number, double interestRate) {
        setOwner(owner);
        setNumber(number);
        setInterestRate(interestRate);
    }
}
