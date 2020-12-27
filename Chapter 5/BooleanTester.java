import java.util.Scanner; // imports scanner class

public class BooleanTester 
{
    public static void main (String[] args)
    {
    
        Scanner scanner = new Scanner(System.in); // intitializes scanner to display in console
    /*    
        System.out.println("Input a string:");
        String inputString = scanner.nextLine(); // told to read input
        System.out.println(inputString); //prints input
    
    */
        System.out.println("Input a boolean:");
        Boolean bool = scanner.nextBoolean(); // told to read input
        System.out.println(bool); // prints input

        if (bool == true)
        {
            System.out.println("Hey, you typed True!");
        }
        else 
        {
            System.out.println("You typed False!");
        }

        

        scanner.close(); // closes scanner to prevent resource leak
    }
}