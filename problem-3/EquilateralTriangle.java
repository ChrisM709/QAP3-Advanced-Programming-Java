public class EquilateralTriangle extends Triangle {

    // constructor
    public EquilateralTriangle(double side) {
        super(side, side, side); // All three sides are equal
    }

    // getters
    public double getSide() {
        return getSide1(); 
    }

    @Override
    public String toString() {
        return "Equilateral Triangle - Side: " + getSide() + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}


