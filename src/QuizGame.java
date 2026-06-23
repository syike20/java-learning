import java.util.Scanner;

public class QuizGame{
    public static void main(String[] args) {
        String[] questions = {
                "A.Which planet is known as the Red Planet?",
                "B.What is the capital city of Australia?",
                "C.Which element has the chemical symbol Au?",
                "D.Who wrote the novel Pride and Prejudice?",
                "E.What is the largest ocean on Earth?"
        };

        String[][] options = {
                {"1. Venus", "2. Mars", "3. Jupiter", "4. Mercury"},
                {"1. Sydney", "2. Melbourne", "3. Canberra", "4. Perth"},
                {"1. Silver", "2. Gold", "3. Aluminum", "4. Argon"},
                {"1. Charlotte Bronte", "2. Emily Dickinson", "3. Jane Austen", "4. Virginia Woolf"},
                {"1. Atlantic Ocean", "2. Indian Ocean", "3. Arctic Ocean", "4. Pacific Ocean"}
        };

        int[] answers = {2,3,2,3,4 };
        int score = 0 ;
        int guess;

        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Welcome to GALAXY QUIZ GAME !!");
        System.out.println("------------------------------");

        for(int i=0; i < questions.length ; i++)
        {
            System.out.println("\n" + questions[i]);
            for(String option: options[i])
            {
                System.out.println(option);

            }
            System.out.print("Enter your choice: ");
            guess = scanner.nextInt();
            if(guess==answers[i])
            {
                System.out.println("-------");
                System.out.println("CORRECT");
                System.out.println("-------");
                score++;
            }else{
                System.out.println("-------");
                System.out.println(" WRONG ");
                System.out.println("-------");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("Your Score is "+score + " out of " + questions.length);
        System.out.println("----------------------------------------------------");
        scanner.close();


    }
}