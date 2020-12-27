public class TesterTester 
{
    public static void main (String[] args)
    {
        
        int[] numbersNegative = {1, 2, 3, 4, -5};
        int[] numbersPositive = {1, 2, 3, 4, 5};
        int[] intArray = {1, 2, 3, 4, 10};

        Tester test = new Tester();

        System.out.println(test.findNegative(numbersNegative));
        System.out.println(test.findNegative(numbersPositive));
        System.out.println(test.findMaximum(intArray));

        

        double[ ] numbers = {1.1, 2.2, 3.3, 4.4, 5.5};

        int lastIndex = numbers.length - 1;

        for (int i = lastIndex; i >= 0; i--)
            System.out.println(numbers[i]);

        

    }
}