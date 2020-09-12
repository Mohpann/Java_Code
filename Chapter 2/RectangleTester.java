import java.awt.Rectangle;

public class RectangleTester {
    public static void main (String[] args) {
/*
        Rectangle r1 = new Rectangle(5, 10, 25, 50);
        System.out.println("The width of the rectangle is " + r1.getWidth());
        System.out.println("The height of the rectangle is " + r1.getHeight());
        System.out.println("The x-value of the rectangle is " + r1.getX());
        System.out.println("The y-value of the rectangle is " + r1.getY());
*/
        Rectangle r2 = new Rectangle(50, 60);
        System.out.println("\nThe width of rectangle 2 is " + r2.getWidth());
        System.out.println("The height of rectangle 2 is " + r2.getHeight());
        System.out.println("The x-value of rectangle 2 is " + r2.getX());
        System.out.println("The y-value of rectangle 2 is " + r2.getY());

        Rectangle r3 = r2;

        System.out.println("\n Output for the r3 Rectangle");
        System.out.println("\nThe width of rectangle 2 is " + r3.getWidth());
        System.out.println("The height of rectangle 2 is " + r3.getHeight());
        System.out.println("The x-value of rectangle 2 is " + r3.getX());
        System.out.println("The y-value of rectangle 2 is " + r3.getY());

        r2.setBounds(1, 2, 3, 4);
        System.out.println("\nThe x-value for the r2 rectangle is " + r2.getX());
        System.out.println("The x-value for the r3 rectangle is " + r3.getX());
    }
}

