package labsheet9.exercise2;

public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public double getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        if (majorAxis > 0)
            this.majorAxis = majorAxis;
        else
            this.majorAxis = 0;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        if (minorAxis > 0)
            this.minorAxis = minorAxis;
        else
            this.minorAxis = 0;
    }

    public double area() {
        return Math.PI * getMajorAxis() * getMinorAxis();
    }

    public double perimeter() {
        double inner = ((getMajorAxis() * getMajorAxis()) + (getMinorAxis() * getMinorAxis()))/2;
        return 2 * Math.PI * Math.sqrt(inner);
    }

    public String toString() {
        return "Shape type: " + type + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }

    public Ellipse() {
        super("Ellipse");
        setMajorAxis(0);
        setMinorAxis(0);
    }

    public Ellipse(double majorAxis, double minorAxis) {
        super("Ellipse");
        setMajorAxis(majorAxis);
        setMinorAxis(minorAxis);
    }
}
