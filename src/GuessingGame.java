import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int number = random.nextInt(10)+1;
        System.out.print("NUMBER WAS : " + number);
        System.out.println("\n");
        System.out.print("Guess any number between 1-10 :");
        while(guess!=number)
        {
           guess = scanner.nextInt();

           if(guess==number)
           {
               System.out.println("You Won !!!🎉🎉");
               scanner.close();
               return;

           }
            System.out.println("WRONG TRY AGAIN 🤣🤣");
        }
        scanner.close();
    }
}