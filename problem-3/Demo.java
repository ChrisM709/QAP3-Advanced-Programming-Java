public class Demo {
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = new Shape[4];
        
        shapes[0] = new Ellipse(6, 4);
        shapes[1] = new Circle(5);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(6);
        
        System.err.println(); //readability
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.err.println(); //readability
    }
}
