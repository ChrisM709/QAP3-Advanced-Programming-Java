public class Demo {
    public static void main(String[] args) {
        //creates a point
        Point p1 = new Point(3.5f, 5.5f);
        System.out.println("p1: " + p1);

        //creates a moveable point using (x, y, xSpeed, ySpeed) constructor
        MovablePoint mp1 = new MovablePoint(13.0f, 13.0f, 2.0f, 6.0f);
        System.out.println("mp1 (before move): " + mp1);
        mp1.move();
        System.out.println("mp1 (after move): " + mp1);

        //creates a moveable point using the (xSpeed, ySpeed) constructor
        MovablePoint mp2 = new MovablePoint(1.5f, 1.5f);
        mp2.setX(6.0f);
        mp2.setY(7.0f);
        System.out.println("mp2 (before move): " + mp2);
        mp2.move();
        System.out.println("mp2 (after move): " + mp2);
    }
}
