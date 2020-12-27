import java.util.ArrayList;

public class ArrayListsTester 
{
    public static void main (String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        Integer number = new Integer(11);

        list.add(new Integer(3)); // removed by list.set
        list.add(new Integer(5));
        list.add(new Integer(5));
        list.add(new Integer(7));
        list.add(1, new Integer(4));
        list.add(number);
        list.set(0, new Integer(1)); // replace first element with 1

        int size = list.size();
        System.out.println("The size of the ArrayList is " + size);

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        for (Integer theNumber: list)
            System.out.println(theNumber);

        //  Remove all of the fives in the ArrayList
        /*
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) == 5)
            {
                list.remove(i);
                i--;
            }
            
            System.out.println("List after removing fives: ");
            for (int j = 0; j < list.size(); j++)
            System.out.println(list.get(j));
        }
        */

        for (int i = list.size() - 1; i >= 0; i--) // HUUUUUGE THIS IS ON THE AP TEST
            if ( list.get(i) == 5)
                list.remove(i);

        System.out.println("List after removing fives: ");
        for (int j = 0; j < list.size(); j++)
        System.out.println(list.get(j));
    }    
}
