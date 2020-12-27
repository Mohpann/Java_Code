public class ArrayAlgorithyms
{
  private int[] theArray;

  public ArrayAlgorithyms()
  {

  }

  public ArrayAlgorithyms(int[] array)
  {
    theArray = array;
  }

  public int findSum(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++)
      sum += array[i];
    return sum;
  }

  public int countMatches(int item) {
    int counter = 0;
    for (int i = 0; i < theArray.length; i++)
      if (theArray[i] == item)
        counter++;
    return counter;
  }

  //Change the value of an element in the array
  public void changeElement(int[] array, int index, int newValue)
  {
    array[index] = newValue;
  }

  //Return the index position of where the element 
  //occurs for the first time. If not in array return -1

  public int find2(int item)
  {
    for (int i = 0; i < theArray.length; i++)
      if (item == theArray[i])
        return i;
    return -1;
  }
  
  //find minimum value in the array.
  public int findMinimum()
  {
    int currMinimum = theArray[0];
    for (int i = 0; i < theArray.length; i++)
      if (currMinimum > theArray[i])
        currMinimum = theArray[i];
    return currMinimum;
  }

  public void swap (int a, int b)
  {
    int temp = theArray[b];
    theArray[b] = theArray[a];
    theArray[a] = temp;
  }

  public boolean find1(int item) 
  {
    for (int i = 0; i < theArray.length; i++)
      if (item == theArray[i])
        return true;
    return false;
  }
}