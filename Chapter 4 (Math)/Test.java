public class Test {
    public static void main (String[] args) {
        int items = 0;
        int two = 2;
        int solution = two * ++items;
        System.out.println(solution);

        int items2 = 0;
        int solution2 = two * items2++;
        System.out.println(solution2);
    }
}
/* 
items++ adds to the variable after everything before it has been done, 
in this case items2 does not get added before it is multiplied 
by variable of type int two while the original items does

position of ++ determines when the operatee is changed
*/