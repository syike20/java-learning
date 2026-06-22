import java.util.Random;
public class randomNum {
    public static void main(String[] args)
    {
        Random random = new Random();
        int number1 ;
        number1 = random.nextInt(1,7 );
        System.out.println(number1);
        double number2 ;
        number2 = random.nextDouble(0,10);
        System.out.println(number2 );
    }
}