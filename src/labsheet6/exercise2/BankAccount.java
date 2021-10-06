package labsheet6.exercise2;

public class BankAccount {
    private String owner;
    private int number;
    private static double interestRate;
    private static int count = 0;

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

    public void incrementCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String toString() {
        return "Owner: " + getOwner() + " Number: " +
                getNumber() + " Interest Rate: " + getInterestRate();
    }

    public BankAccount() {
        incrementCount();
        setOwner("Owner not available");
        setNumber(count);
        setInterestRate(0);
    }

    public BankAccount(String owner, int number, double interestRate) {
        incrementCount();
        setOwner(owner);
        setNumber(count);
        setInterestRate(interestRate);
    }
}
