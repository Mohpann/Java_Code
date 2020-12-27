public class bankingTester {
    public static void main (String[] args)
    {
        double principal = 3000; 
        double rate = 2; // in %
        double time = 6; // in years

        for (int i = 1; i <= time; i++)
        {
            double interest = principal * (rate/100.0);
            System.out.printf("\nThe interest is $%5.2f", interest);

            principal += interest;
            System.out.printf("\nThe new balance is %8.2f" + principal);
        }

    }    
}
