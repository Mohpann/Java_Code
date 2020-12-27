public class Homework {
    public static void main (String[] args)
    {
        /*
        int sum = 0;
        int integer = 1;

        while (integer <= 10)
        {
            if (sum == 3 || sum == 6)
            {
                sum += 0;
            }

            sum += integer;
            integer++;
        }

        System.out.println(sum);
        


        for (int i = 1; i <= 10; i++)
        {
            if (i == 6)
                continue;

            System.out.println(i);
        }


        for (int row = 7; row > 0; row--)
        {
            for (int col = 1; col <= row - 1; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        */

        for (int row = 0; row < 5; row++)
        {
            for (int before = 0; before < row; before++)
                System.out.print("0");
            System.out.print("1");
            for (int after = 4; after > row; after--)
                System.out.print("0");

            System.out.println();
        }
    }
}