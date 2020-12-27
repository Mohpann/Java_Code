import java.util.Scanner;

public class TestClassTester {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter price: ");
        double price = in.nextDouble();
        System.out.println(price);

        in.close();
    }
}
