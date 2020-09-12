import javax.swing.JOptionPane;

public class JOptionPaneTester 
{
    public static void main (String[] args)
    {
        String number1 = JOptionPane.showInputDialog("Enter the first number.");
        String number2 = JOptionPane.showInputDialog("Enter the second number.");

        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        JOptionPane.showMessageDialog(null, "Sum of the numbers is " + (num1 + num2));

        if (num1 == 6 && num2 == 9) {
            JOptionPane.showMessageDialog(null, "Nice!");
        }

        System.exit(0);
    }


}