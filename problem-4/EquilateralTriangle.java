public class EquilateralTriangle extends Triangle{

    // constructor
    public EquilateralTriangle(double side) {
        super(side, side, side); 
    }

    // getters
    public double getSide() {
        return getSide1(); 
    }

    @Override
    public void scale(double factor) {
        super.scale(factor);
    }

    @Override
    public String toString() {
        return "Equilateral Triangle - Side: " + getSide() + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}

