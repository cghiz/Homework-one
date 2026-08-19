import java.util.Scanner;
public class HWP7
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int number;
        System.out.print("Enter an integer:");
        number= keyboard.nextInt();
        for (int i=1; i<=number; i++)
        {
            if (number%i==0)
            {
                System.out.println(i);
            }
        }
    }
}
