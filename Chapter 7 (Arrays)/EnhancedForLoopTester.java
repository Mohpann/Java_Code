public class EnhancedForLoopTester 
{
    public static void main (String[] args)
    {
        int[] numbers = {1,2,3,4,5};
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);

        for (int i: numbers)
            System.out.println(i);

        String[] cities = {"Dubai", "Tuscon", "Paris", "Chicago", "Tokyo"};
        for (String i: cities)
            System.out.println(i);

        String first = cities[0];
        for (String cityName: cities)
        {
            if (first.compareTo(cityName) > 0)
                first = cityName;
        }
        System.out.println(first);
    }
}
