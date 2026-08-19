import java.util.Scanner;
public class HWP8
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double currentGPA, targetGPA, gradePoints;
        int credits, classes=0;
        System.out.print("Enter the current GPA, credits, and target GPA:");
        currentGPA= keyboard.nextDouble();
        credits= keyboard.nextInt();
        targetGPA= keyboard.nextDouble();

        while (currentGPA<targetGPA)
        {
            gradePoints= currentGPA*credits;
            credits= credits+3;
            gradePoints= gradePoints+(3*4);
            currentGPA= gradePoints/credits;
            classes++;
        }
        System.out.println("You will need "+classes+" A's in 3-credit classes to get to a "+targetGPA+("."));
    }
}
