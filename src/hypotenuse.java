import java.util.Scanner;
public class hypotenuse
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double hypotenuse = Math.sqrt((a*a)+(b*b));
        System.out.println(hypotenuse);
        scanner.close();
    }
}