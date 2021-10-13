package labsheet8.exercise2;

public class Car extends Vehicle {
    private int maxPassengers;
    private String registrationNumber;

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String reg) {
        if(Validator.isValidRegistrationNumber(reg))
            registrationNumber=reg;
        else
            registrationNumber="Invalid Registration Number";

    }

    public String toString() {
        return String.format("Price: %.2f\nLength: %.2f\nHeight: %.2f\nWeight: %.2f\nManufacturer: %s\nModel: %s\n" +
                        "Max passengers: %d\nRegistration number: %s",  getPrice(), getLength(), getHeight(),
                        getWeight(), getManufacturer(), getModel(), getMaxPassengers(), getRegistrationNumber());
    }

    public Car() { this(0.0, 0.0, 0.0, 0.0, "No manufacturer specified",
            "No model specified", 0, "No registration number specified"); }

    public Car(double price, double length, double height, double weight, String manufacturer, String model,
               int maxPassengers, String registrationNumber) {
        super(price, length, height, weight, manufacturer, model);
        setMaxPassengers(maxPassengers);
        setRegistrationNumber(registrationNumber);
    }
}
