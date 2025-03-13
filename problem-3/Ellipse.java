public class Ellipse extends Shape {
    private double a;
    private double b;

    // constructor
    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        this.a = Math.max(axis1, axis2);
        this.b = Math.min(axis1, axis2);
    }

    //getters
    public double getMajorAxis() {
        return a;
    }

    public double getMinorAxis() {
        return b;
    }

    //setters
    public void setAxes(double axis1, double axis2) {
        this.a = Math.max(axis1, axis2);
        this.b = Math.min(axis1, axis2);
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.sqrt(2 * (a * a + b * b)) - ((a - b) * (a - b) / 2);
    }
}
