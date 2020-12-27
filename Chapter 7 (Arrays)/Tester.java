public class Tester 
{    
    public int findMaximum(int[ ] values)
    {
        int biggest = values[0];

        for (int i = 0; i < values.length; i++)
            if (biggest < values[i])
                biggest = values[i];
        return biggest;
    }
    
    public int findNegative(int[] numbers)
    {
        int index = -1;

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] < 0)
                index = numbers[i];
        }
        return index;
    }
}
