public class StringSubstringTester {
    public static void main (String[] args)
    {
        String school = "Hinsdale Central";
        System.out.println("The string length is " + school.length());
        System.out.println("The index position of H is " + school.indexOf("H"));

        System.out.println(school.substring(3)); //sdale Central
        System.out.println(school.substring(5)); //ale Central
        System.out.println(school.substring(9)); //Central

        System.out.println(school.substring(1,4)); //ins
        System.out.println(school.substring(3,10)); //sdale C
    }
}
