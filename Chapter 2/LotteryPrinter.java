import java.util.Random;

public class LotteryPrinter {
    public static void main (String[] args){
        Random generator = new Random();
        int firstNumber = generator.nextInt(49) + 1;
        int secondNumber = generator.nextInt(49) + 1;
        int thirdNumber = generator.nextInt(49) + 1;
        int fourthNumber = generator.nextInt(49) + 1;
        int fifthNumber = generator.nextInt(49) + 1;
        int sixthNumber = generator.nextInt(49) + 1;
        System.out.println("Play this combination, it'll make you rich!");
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        System.out.println(fourthNumber);
        System.out.println(fifthNumber);
        System.out.println(sixthNumber);
    }
}