import java.util.Scanner;
public class HWP2 {
    public static void main(String[] args)
    {
        int number1, number2, number3, number4, number5;
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Give five integers:");
        number1= keyboard.nextInt();
        number2= keyboard.nextInt();
        number3= keyboard.nextInt();
        number4= keyboard.nextInt();
        number5= keyboard.nextInt();
        System.out.print(number1+number2+number3+number4+number5);
    }
}
