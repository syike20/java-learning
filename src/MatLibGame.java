import java.util.Scanner;
public class MatLibGame {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String adjective;
        String noun;
        String verb;
        String animal;
        String place;

        System.out.println("-----------------------");
        System.out.println("MAD LIBS GAME");
        System.out.println("-----------------------");
        System.out.print("Provide an adjective: ");
        adjective = scanner.nextLine();
        System.out.print("Provide a noun: ");
        noun = scanner.nextLine();
        System.out.print("Provide a verb (past tense): ");
        verb = scanner.nextLine();
        System.out.print("Provide an animal: ");
        animal = scanner.nextLine();
        System.out.print("Provide a place: ");
        place = scanner.nextLine();

        System.out.println("Today I had a "+adjective+" day.");
        System.out.println("I found a giant "+noun+" sitting in the middle of the road.");
        System.out.println("Suddenly, it "+verb+" into the air and landed on the "+animal+".");
        System.out.println("Everyone laughed, and the " +animal+ " ran all the way to the " +place+ ".");
        System.out.println("It was the strangest thing I had ever seen!");



        scanner.close();
    }

}