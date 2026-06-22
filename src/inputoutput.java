//Calculate Area and Perimeter of Rectangle
import java.util.Scanner;
public class inputoutput {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length & Width of the Rectangle ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double Area = length * width ;
        double Perimeter = 2*(length+width);
        System.out.println("Area: "+Area);
        System.out.println("Perimeter: "+Perimeter);

        scanner.close();
    }
}