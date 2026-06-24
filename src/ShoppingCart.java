import java.util.Scanner;
import java.util.Random;
public class ShoppingCart {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String item ;

        System.out.print("What item would you like to Buy?: ");
        item = scanner.nextLine();

        double price = random.nextDouble(1,200);
        System.out.printf("Price of the item is ₹%.2f\n",price);

        int quantity ;
        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        double total = price * quantity;
        System.out.printf("Total: ₹%.2f",total);


        System.out.println();
    }
}