public class NestedLoopTester {
    public static void main (String[] args)
    {
        /*
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 2; j++)
                System.out.println(j);
        }
        
        for (int i = 1; i < 3; i++)
        {
            for (int j = 2; j <= 6; j+=2)
                System.out.print(j);
            System.out.println();
        }
        

        int counter = 0;

        for (int i = 5; i < 25; i +=5)
            for (int j = 2; j < 5; j++)
                counter++;
        System.out.println("Counter = " + counter);
        

        for (int row = 1; row <= 3; row++)
        {
            for (int col = 1; col <= 4; col++)
                System.out.print(row);
            System.out.println();
        }
        

        12345
        1234
        123
        12
        1
        */

        for (int row = 5; row >= 1; row--)
        {
            for (int col = 1; col <= row; col++)
                System.out.print(col);
            System.out.println();
        }
        /*
        1
        12
        123
        1234
        12345
        */ 

        for (int row = 1; row <= 5; row++)
        {
            for (int col = 1; col <= row; col++)
                System.out.print(col);
            System.out.println();
        }
    }
}
