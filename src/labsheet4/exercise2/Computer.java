package labsheet4.exercise2;

public class Computer {
    private String manufacturer;
    private String type;
    private double speed;
    private int ram;
    private double price;

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

    public int getRam() { return ram; }

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

    /*public Computer() {
        setManufacturer("Not available");
        setType("Not available");
        setSpeed(0);
        setRam(0);
        setPrice(0);
//        shorthand: this("Not available","Not available",0,0,0);
    }

    public Computer(String manufacturer, String type, double speed, int ram, double price ) {
        setManufacturer(manufacturer);
        setType(type);
        setSpeed(speed);
        setRam(ram);
        setPrice(price);
    }*/
}
