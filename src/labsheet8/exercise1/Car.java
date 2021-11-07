package labsheet8.exercise1;

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

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Car() { }

    // Finish
    public Car(double price, double length, double height, double weight, String manufacturer, String model, int maxPassengers, String registrationNumber) {
        super();
    }
}
