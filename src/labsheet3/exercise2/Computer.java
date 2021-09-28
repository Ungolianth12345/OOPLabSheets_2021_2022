package labsheet3.exercise2;

public class Computer {
    private String manufacturer = "Not available";
    private String type = "Not available";
    private double speed = 0;
    private int ram = 0;
    private double price = 0;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed > 0)
            this.speed = speed;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram > 0)
            this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
    }

    public String toString() {
        return "Manufacturer: " + getManufacturer() + " Type: " + getType() + " Speed: " + getSpeed() + " RAM: "
                + getRam() + " Price: " + getPrice();
    }

    public Computer() {
        manufacturer = "Not available";
        type = "Not available";
        speed = 0;
        ram = 0;
        price = 0;
    }

    public Computer(String manufacturer, String type, double speed, int ram, double price ) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.speed = speed;
        this.ram = ram;
        this.price = price;
    }
}
