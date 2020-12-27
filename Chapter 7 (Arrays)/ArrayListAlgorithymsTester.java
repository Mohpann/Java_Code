import java.util.ArrayList;

public class ArrayListAlgorithymsTester 
{
    public static void main (String[] args)
    {
        int[] values = {2,4,2,2,7,2,7,7,7};
        
        
        ArrayListAlgorithyms x = new ArrayListAlgorithyms(values);
        /*
        for(Integer e: iPositions)
            System.out.println(e);

        ArrayList<Integer> intPos = x.findDivLocations(2);

        System.out.println("%%%%%");

        for (int i = 0; i < intPos.size(); i++)
            System.out.println(intPos.get(i));

        */
        System.out.println("Mode of Array:");
        ArrayList<Integer> modes = x.findMode();
        System.out.println(modes);
    }
}
