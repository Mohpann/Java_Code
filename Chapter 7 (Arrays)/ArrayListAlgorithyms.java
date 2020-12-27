import java.util.ArrayList;

public class ArrayListAlgorithyms 
{
    private int[] numbers;


    public ArrayListAlgorithyms()
    {

    }

    public ArrayListAlgorithyms(int[] n)
    {
        this.numbers = n;
    }

    // Find and return all of the index positions where the item is located in the array and return an arraylist 

    public ArrayList<Integer> find(int item)
    {
        ArrayList<Integer> indexPos = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] == item)
                indexPos.add(new Integer(i));
        return indexPos;
    }

    //find the location of all the numbers divisible by 3
    public ArrayList<Integer> findDivLocations(int item)
    {
        ArrayList<Integer> indexP = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] % item == 0)
                indexP.add(new Integer(i));
        }
        return indexP;
    }

    //find the mode
    //21423482447
    public ArrayList<Integer> findMode()
    {
        ArrayList<Integer> modes = new ArrayList<Integer>();
        int modeFrequency = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            int currFrequency = 1;
            for (int j = i + 1; j < numbers.length; j++)
            {
                if (numbers[j] == numbers[i])
                    currFrequency += 1;
            }
            if (currFrequency > modeFrequency)
            {
                modes = new ArrayList<Integer>();
                modes.add(numbers[i]);
                modeFrequency = currFrequency;
            }
            else if (currFrequency == modeFrequency)
            {
                modes.add(numbers[i]);
            }
        }
        return modes;
    }
/*
Mode frequency function()
__
Arraylist<integers> mode

For (traverses through array) Reset variables (frequency…)
	
	For (compare/count the frequency of item)
		Count frequencies
	Check for new/additional mode
		Reset mode 
	If (counterfrequency == modefrequency)
		Add mode (to arraylist)
	Else if (cf > mf)
{
	Remove all current modes
	Add new mode
} 
*/
}
