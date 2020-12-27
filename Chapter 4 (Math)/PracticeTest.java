public class PracticeTest 
{
    public static void main (String[] args){
        Practice practice = new Practice(2);
        System.out.println(practice); //number = 2

        System.out.println(practice.practiceChanger(6)); // 8
        System.out.println(practice); // number = 2

        Practice practice2 = new Practice(2);
        System.out.println(practice2.practiceChanger(3)); // 6
    }
}
