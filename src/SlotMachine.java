import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

    static Random random = new Random();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        System.out.println("-------------------------");
        System.out.println("  Welcome to Java Slots  ");
        System.out.println(" Symbols: 🍇 🥭 ⭐ 🌸 💎");
        System.out.println("-------------------------");

        while (balance > 0) {

            System.out.println("\nCurrent Balance: $" + balance);

            System.out.print("Place your bet amount: $");
            bet = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (bet > balance) {
                System.out.println("Insufficient funds!");
                continue;
            }

            if (bet <= 0) {
                System.out.println("Bet must be greater than 0.");
                continue;
            }

            balance -= bet;

            System.out.println("\nSpinning...\n");

            row = spinRow();

            printRow(row);

            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("🎉 You won $" + payout + "!");
                balance += payout;
            } else {
                System.out.println("😢 Sorry, you lost this round.");
            }

            System.out.println("Current Balance: $" + balance);

            if (balance <= 0) {
                System.out.println("\nYou are out of money!");
                break;
            }

            System.out.print("\nDo you want to play again? (Y/N): ");
            playAgain = scanner.nextLine().trim().toUpperCase();

            if (!playAgain.equals("Y")) {
                break;
            }
        }

        System.out.println("\nThank you for playing Java Slots!");
        scanner.close();
    }

    static String[] spinRow() {

        String[] symbols = {"🍇", "🥭", "⭐", "🌸", "💎"};
        String[] row = new String[3];

        for (int i = 0; i < row.length; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row) {

        System.out.println("-------------------");
        System.out.println("| " + String.join(" | ", row) + " |");
        System.out.println("-------------------");
    }

    static int getPayout(String[] row, int bet) {

        if (row[0].equals(row[1]) && row[1].equals(row[2])) {

            return switch (row[0]) {
                case "🍇" -> bet * 3;
                case "🥭" -> bet * 4;
                case "⭐" -> bet * 5;
                case "🌸" -> bet * 6;
                case "💎" -> bet * 7;
                default -> 0;
            };
        }

        return 0;
    }
}