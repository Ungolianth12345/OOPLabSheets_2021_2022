package labsheet9.exercise1;

public final class SelfEmployedWorker extends Employee {
    private double estimatedIncome;

    public double earnings() {
        return estimatedIncome;
    }

    public void setEstimatedIncome() {
        this.estimatedIncome = (int)(Math.random() * 500) + 400;
    }

    public String toString() {
        return "Self-employed worker's name is " + super.toString();
    }

    public SelfEmployedWorker(String firstName, String lastName) {
        super(firstName, lastName);
        setEstimatedIncome();
    }
}
