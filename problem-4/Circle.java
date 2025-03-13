public class Circle extends Ellipse{

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

    @Override
    public void scale(double factor) {
        this.radius *= factor;
        setAxes(radius, radius);
    }

    @Override
    public String toString() {
        return "Circle - Radius: " + getMajorAxis() + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
