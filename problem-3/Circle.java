public class Circle extends Ellipse {

    private double radius;

    // constructor
    public Circle(double radius) {
        super(radius, radius);
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Overrides toString to properly display shape details
    @Override
    public String toString() {
        return "Circle - Radius: " + getMajorAxis() + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}