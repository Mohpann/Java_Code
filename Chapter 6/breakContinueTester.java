public class breakContinueTester {
    public static void main (String[] args)
    {
        for (int i = 0; i < 12; i++)
            System.out.println(i);

        System.out.println("BreakDemo");
        for (int i = 0; i < 12; i++)
        {
            if(i==6)
                break;
            System.out.println(i);
        }

        System.out.println("ContinueDemo");
        for (int i = 0; i < 12; i++)
        {
            if(i==6)
                continue;
            System.out.println(i);
        }

        int choice = 2;

        switch(choice)
        {
            case 1: System.out.println("One");
                break;
            case 2: System.out.println("Two");
                break;
            case 3: System.out.println("Three");
                break;
            default: System.out.println("Invalid number");
                break;
        }
    } 
}
