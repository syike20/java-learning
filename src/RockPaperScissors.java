import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean restart = true ;
        while (restart) {
            String[] options  = {"ROCKS","PAPER","SCISSORS"};
            int Opponent_choice = random.nextInt(options.length);
            String randomOption = options[Opponent_choice];
            String choice  ;
            System.out.print("Enter your choice(ROCK,PAPER,SCISSORS): ");
            choice= scanner.nextLine().toUpperCase();

            if(choice.equals(randomOption))
            {
                System.out.println("YOU WIN !!");
            }else{
                System.out.println("YOU LOSE");
            }

            System.out.print("Do u want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toUpperCase();
            if(playAgain.equals("NO"))
            {
                restart = false;
            }
        }


    }





    }