public class Demo {
    public static void scaleShapes(Scalable[] scalableObjects, double scaleFactor) {
        for (Scalable obj : scalableObjects) {
            obj.scale(scaleFactor);
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(15);
        shapes[1] = new Triangle(4, 6, 9);
        shapes[2] = new Ellipse(7, 2);
        shapes[3] = new EquilateralTriangle(4);

        // shapes before scaling
        System.out.println("Original Shapes:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        // scale the shapes 
        scaleShapes(shapes, 2.0);

        // shapes after scaling
        System.out.println("\nShapes after scaling by factor of 2.0:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
