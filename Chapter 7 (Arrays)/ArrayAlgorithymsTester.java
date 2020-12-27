public class ArrayAlgorithymsTester
{
  public static void main (String[] args)
  {
    int[] numbers={-3,5,2,1,4};          
    int[] numbers2={2,4,2,6,7,1};          
    ArrayAlgorithyms x=new ArrayAlgorithyms();          
    ArrayAlgorithyms y=new ArrayAlgorithyms(numbers2);


    for (int i = 0; i < numbers2.length; i++)
      System.out.print(numbers2[i]);

    y.swap(2,3);

    System.out.println("\nSwapped Array:");
    for (int i = 0; i < numbers2.length; i++)
      System.out.print(numbers2[i]);

    
    System.out.println("The sum of the elements in the array is "+x.findSum(numbers));

    System.out.println("The number 3 appears "+y.countMatches(3)+" times in the array.");

    System.out.println("Is number 2 is in the array?"+y.find1(2));
    

    x.changeElement(numbers, 4, 7);

    System.out.println("The changed array of numbers is ");
    for (int i = 0; i < numbers.length; i++)
      System.out.println(numbers[i]);

    System.out.println("The number 2 is located at index position "+ y.find2(2));
    
  }
}