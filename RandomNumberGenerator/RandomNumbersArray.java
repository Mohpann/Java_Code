//Write a program that fills an array with 10 different random numbers between 1 and 25 inclusive.   You must use the random method from the Math class.


public class RandomNumbersArray

{

        public RandomNumbersArray( ) 
        {
            
        }

        public RandomNumbersArray(int x)

        {

               numbers=new int[x];

        }

 

        public int[ ] createRandomNumbers( )

        {
            for (int i = 0; i < numbers.length; i++)
            {
                numbers[i] = (int)(1 + (Math.random() * 25));
            }

            return numbers;
        }

   

         private int[] numbers;

}