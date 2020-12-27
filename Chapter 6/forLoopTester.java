public class forLoopTester 
{
    public static void main(String[] args)
{


        /*
        for (int i = 0; i < 4; i++)
            System.out.println(i);
        System.out.println("Done");

        for (int i = 0; i <= 3; i++)
            System.out.println(i);
        System.out.println("Done");
        

        for (int i = 10; i > 0; i -=2)
            System.out.println(i);
        System.out.println("Done");
        

        // 3 6 9 12

        for (int i = 3; i <= 12; i += 3)
            System.out.println(i);
        System.out.println("Done");
        

        // 10 9 8 7 6 5 4 3 2 1 blastoff!

        for (int i = 10; i > 0; i--)
            System.out.println(i);
        System.out.println("Blastoff!");

        

        // 1 4 9 1 16 25 36

        for (int i = 1; i <= 6; i++)
            System.out.println(i*i);
        System.out.println("Done Making squares");

        int i = 0;
        do {
            System.out.println(i);
            i++;
        }while(i<5);
        

        // For loop 
        for (int i = 0; i < 5; i++) // 0 to 4
            System.out.println(i);
        System.out.println("Done with for loop");

        // Do While loop
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
        System.out.println("Done with do while loop");
        
        // While Loop
        i = 0;
        while (i < 5)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("Done with while loop");
         
        String message = "Ix lovex youxxx";

        System.out.println(message);
        
        int i = message.indexOf("x");

        while (i >= 0)
        {
            message = message.substring(0,i) + message.substring(i+1);
            System.out.println(message);

            i = message.indexOf("x");
        }
    
        
        
        for (int row = 0; row < 2; row++)
        {
            for (int col = 0; col < 7 ; col++)
                System.out.print("*");
            System.out.println();
        }
        
        */
        int sum = 0;
        for (int i = 10; i <= 20; i+=2)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}