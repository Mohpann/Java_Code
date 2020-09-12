import java.util.Random;

public class RandomNumberClass {
    public static void main (String[] args) {
        Random generator = new Random();

        int number2 = generator.nextInt(3); {
            
            System.out.println(number2);
        }
    }
}