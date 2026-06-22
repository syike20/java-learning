import java.util.Scanner;
public class tempConverter {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double temp  ;
        System.out.println("Enter Value: ");
        temp = scanner.nextDouble();
        double newtemp ;
        String choice ;
        System.out.println("Enter C TO CONVERT INTO FAHRENHEIT OR Enter F to CONVERT INTO CELSIUS");
        choice = scanner.next().toUpperCase();
        newtemp = (choice.equals("C")) ? (temp *(9.0/5.0))+32 : (temp-32)*(5.0/9.0);
        System.out.println(newtemp);
        scanner.close();

    }
}
