package labsheet8.exercise1;

public class Bicycle extends Vehicle {
    private int gearCount;
    private boolean hasBell;

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public boolean isHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }

    public String toString() {
        String getBell = isHasBell() ? "Yes" : "No";
        return String.format("Price: %.2f\nLength: %.2f\nHeight: %.2f\nWeight: %.2f\nManufacturer: %s\nModel: %s" +
                        "\nHas bell: %s\nGear count: %d", getPrice(), getLength(), getHeight(), getWeight(),
                        getManufacturer(), getModel(), getBell, getGearCount());
    }

    public Bicycle() { this(0.0, 0.0, 0.0, 0.0, "No manufacturer specified",
            "No model specified", 0, false); }

    public Bicycle(double price, double length, double height, double weight, String manufacturer, String model,
               int gearCount, boolean hasBell) {
        super(price, length, height, weight, manufacturer, model);
        setGearCount(gearCount);
        setHasBell(hasBell);
    }
}
