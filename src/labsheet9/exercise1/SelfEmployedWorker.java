package labsheet9.exercise1;

public final class SelfEmployedWorker extends Employee {
    private double estimatedIncome;

    @Override
    public double earnings() {
        return (int)(Math.random() * 500) + 400;
    }

    public void setEstimatedIncome(double estimatedIncome) {
        this.estimatedIncome = estimatedIncome;
    }

    //@Override
    public String toString() {
        return "Self-employed worker's name is " + super.toString();
    }

    public SelfEmployedWorker(String firstName, String lastName) {
        super(firstName, lastName);
        setEstimatedIncome(earnings());
    }
}
