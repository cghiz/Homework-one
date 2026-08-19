import java.util.Scanner;
public class HWP4
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int number1,number2,remainder;
        System.out.print("Enter two integers:");
        number1= keyboard.nextInt();
        number2= keyboard.nextInt();
        while(number2 !=0)
        {
            remainder= number1%number2;
            number1=number2;
            number2=remainder;
        }
        System.out.println("The Greatest Common Divisor is "+number1);
    }
}
