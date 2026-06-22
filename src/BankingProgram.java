import java.util.Scanner;
void main(){
    Scanner scanner = new Scanner(System.in);
    // Welcome to Banking Program
    System.out.println("***** WELCOME TO THE BANKING PROGRAM *****");
    System.out.println();
    // Variables
    double balance = 0;
    int choice;

    while (true) {
        // MENU
        System.out.println("""
                     Account Information : PRESS 1
                     To Check Balance    : PRESS 2\s
                     TO Withdraw         : PRESS 3\s
                     To Deposit          : PRESS 4\s
                     To Exit             : PRSSS 5\s
                    \s""");
        System.out.println();
        System.out.print("Enter your choice : ");
        choice = scanner.nextInt();
        if (choice == 1) {
            accountInformation();
        } else if (choice == 2) {
            checkBalance(balance);
        } else if (choice == 3) {
            balance = Withdraw(balance , scanner);
        } else if (choice == 4) {
            balance = Deposit( balance , scanner);

        } else if (choice == 5) {
            break;
        } else {
            System.out.println("Enter a VALID OPTION !!");
        }
    }
}


static void accountInformation() {
    System.out.println("""
            Account Number : 59239530031\s
            Holder's Name : Spike \n""");
}

static void checkBalance(double balance)
{
    System.out.print("Balance : "+balance);
    System.out.println("\n");
}
static double Withdraw(double balance , Scanner scanner)
{
    System.out.print("Enter Withdraw Amount: " );
    double Amount = scanner.nextDouble();
    if(balance< Amount)
    {
        System.out.println("Balance is not sufficient !!\n");

    }else{
        balance -= Amount;
        System.out.println("SUCCESS !! Balance has been updated.");

    }
    return balance;
}
static double Deposit(double balance , Scanner scanner)
{
    System.out.print("Enter Deposit Amount: ");
    double Amount = scanner.nextDouble();
    balance += Amount;
    System.out.println("SUCCESS !! Balance has been updated.");
    return balance;
}
