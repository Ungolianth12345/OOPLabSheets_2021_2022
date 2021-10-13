package labsheet7.sampleprogram1;

//Product.java
/*A simple instantiable class definition for a Product*/

public class Product {
    private int id;
    private static int count = 1000000;
    private String name;
    private String description;

    public Product(String name, String description) {
        setName(name);
        setDescription(description);
        setId();
    }

    private void incrementCount() {
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        incrementCount();
        this.id = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Product details are as follows: id: " + getId() + "  name: " + getName() + "  description: " + getDescription();
    }
}