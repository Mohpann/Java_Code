import java.util.Scanner;
import java.util.Random;

public class GuessingGame 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100);
        int guesses = 1;
        System.out.println("Type number:");
        int inputNumber = scan.nextInt();

        while (inputNumber != number)
        {
            if (inputNumber > number)
            {
                System.out.println("Too high...");
            }
            else if (inputNumber < number)
            {
                System.out.println("Too low...");
            }
            System.out.println("Type new number:");
            inputNumber = scan.nextInt();

            guesses += 1;
        }
        System.out.println("You got it!");
        System.out.println("Your number of guesses is " + guesses);

        if (guesses <= 7)
        {
            System.out.println("You did it in less than seven tries");
        }
        else 
            System.out.println("You did not do it in less than seven tries");

        scan.close();
    }
}
