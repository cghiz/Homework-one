import java.util.Scanner;
public class HWP3 {
    public static void main(String[] args)
    {
        double point1,point2,point3,point4,point5,pointsAdded,average;

        Scanner keyboard= new Scanner(System.in);
        System.out.print("Please give 5 numbers to get an average.");
        point1=keyboard.nextDouble();
        point2=keyboard.nextDouble();
        point3=keyboard.nextDouble();
        point4=keyboard.nextDouble();
        point5=keyboard.nextDouble();
        pointsAdded= (point1+point2+point3+point4+point5);
        average= pointsAdded/5.0;
        int averageRounded= (int)Math.round(average);
        System.out.print("The average of those numbers is "+averageRounded);
    }
}
