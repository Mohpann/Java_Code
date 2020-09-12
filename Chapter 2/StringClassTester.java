import jdk.nashorn.api.tree.ForLoopTree;

public class StringClassTester 
{
    public static void main(String[] args)
    {
        // Creating a string as a primitive data type
        
        String sport = "tennis";

        System.out.println("My favorite sport is " + sport + ".");

        int length = sport.length();
        System.out.println("The number of characters  in my sport is " + length + ".");

        System.out.println("The number of characters in my sport is " + sport.length() + ".");

        System.out.println("The index position of g in the string is " + sport.indexOf("n") + ".");
        

        // Creating a String as an object

        String schoolName = new String ("Hinsdale Central");
        String school_name = new String("Java Central");
        System.out.println("I am a student at " + schoolName + ".");

        System.out.println("My school name in all uppercase is " + schoolName.toUpperCase() + ".");


        
    }
}