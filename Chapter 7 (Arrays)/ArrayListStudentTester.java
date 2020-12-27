import java.util.ArrayList;

public class ArrayListStudentTester
{
    public static void main (String[] args)
    {
        ArrayList<Student> list = new ArrayList<Student>();

        list.add(new Student("Mickey Mouse", 5.7));
        list.add(new Student("Donald Duck", 5.4));
        list.add(new Student("Elsa", 5.5));
        list.add(1, new Student("Pluto", 4.9));
        list.add(new Student("Aladin", 4.5));
        list.add(new Student("Minnie Mouse", 4.8));
        //Looping through
        /*
        1 Find the List
        2 Find the object in the list
        3 Get the data of the object
        */

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i).getName());

        /*
        for (Student theStudent: list) // theStudent holds the pointer to the element
            System.out.println(theStudent.getName());
        

        // Find the average gpa of all students

        double sumOfGPAS = 0;

        for (int i = 0; i < list.size(); i++)
        {
            sumOfGPAS += list.get(i).getGPA();
        }

        System.out.printf("The average is %4.2f.", sumOfGPAS/list.size());
        

        System.out.println("Before the set method is called.");

        System.out.println(list.set(1, new Student("Jasmine", 4.9)).getName());

        System.out.println(list.get(1).getName());
        */

        //Remove all students with gpa less than 5.0

        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).getGPA() < 5.0)
            {
                list.remove(i);
                i--;
            }
        }
        System.out.println("Students after deleting.");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i).getName()+" " + list.get(i).getGPA());
    }
}
