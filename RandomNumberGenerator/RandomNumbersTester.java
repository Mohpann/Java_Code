public class RandomNumbersTester

{

       public static void main(String[] args)

      {

                RandomNumbersArray x=new RandomNumbersArray(10);

                 int[ ] numbers=x.createRandomNumbers( );

                 for(int i=0; i<numbers.length; i++)

                        System.out.println(numbers[i]);

      }

}