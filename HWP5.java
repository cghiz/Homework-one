import java.util.Scanner;
public class HWP5
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int today, futureDate, daysLater, day;
        System.out.print("Enter today's date and a future date:");
        today = keyboard.nextInt();
        futureDate = keyboard.nextInt();
        daysLater = futureDate - today;
        day = daysLater % 7;

        if (day == 0)
            System.out.println("Monday");
        else if (day == 1)
            System.out.println("Tuesday");
        else if (day == 2)
            System.out.println("Wednesday");
        else if (day == 3)
            System.out.println("Thursday");
        else if (day == 4)
            System.out.println("Friday");
        else if (day == 5)
            System.out.println("Saturday");
        else
            System.out.println("Sunday");
    }
}
