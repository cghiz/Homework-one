import java.util.Scanner;
public class HWP1
{
    public static void main(String[] args)
    {
        String name;
        Scanner keyboard= new Scanner(System.in);
        System.out.print("What is your name?");
        name= keyboard.nextLine();
        System.out.println("Hello,"+ name);
    }
}
