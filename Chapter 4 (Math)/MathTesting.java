public class MathTesting {
    public static void main (String[] args)
    {

        //converting a double to an integer 
        //removes the decimals (truncatioin)
        double number1 = 4.5678;
        int number2 = (int)number1;
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

        //converting an integer to a double
        int number3 = 5;
        double number4 = (double)number3;
        System.out.println("number3 = " + number3);
        System.out.println("number4 = " + number4);

        System.out.println((int)3.789);
        System.out.println(Math.round(3.789));

        //convert Strings to numbers
        String sValue1 = "123";
        int value1 = Integer.parseInt(sValue1);
        System.out.println(value1 + 2);

        String sValue2 = "10.25";
        double value2 = Double.parseDouble(sValue2);
        System.out.println(value2 + 0.1);

    }
}
