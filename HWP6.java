import java.util.Scanner;
public class HWP6
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int number;
        System.out.print("Enter 5 numbers 0-20:");

        for (int i=1;i<=5;i++)
        {
            number= keyboard.nextInt();

            for (int j=1;j<=number;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
