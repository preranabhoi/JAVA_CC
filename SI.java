
import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        float SI;
        float Amount;
        try (Scanner SC = new Scanner(System.in)) {
            System.out.print("Enter Principal:");
            float Principal = SC.nextFloat();

            System.out.print("Enter Rate:");
            float Rate = SC.nextFloat();

            System.out.print("Enter Time:");
            float Time = SC.nextFloat();

            SI = (Principal * Rate * Time) / 100;

            Amount = Principal + SI;

            System.out.println("Simple Interest is:" + SI);

            System.out.println("Total amount is:" + Amount);
        }
    }
}
