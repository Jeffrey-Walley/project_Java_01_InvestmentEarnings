import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanny = new Scanner(System.in);
        System.out.println("Enter the buying price per share: ");
        double buyingPrice = scanny.nextDouble();
        int day = 1;
        double closingPrice = 0.1;
        DecimalFormat deciForm = new DecimalFormat("0.00");

        while (true) {
            System.out.println("Enter the closing price for day " + day + " (enter a negative value to leave program): ");

            closingPrice = scanny.nextDouble();
            if (closingPrice < 0.0) break;
            double earnings = closingPrice - buyingPrice;
            if (earnings > 0) {
                System.out.println("After day " + day + ", you earned " + deciForm.format(earnings) + " per share.");
            } else if (earnings < 0.0) {
                System.out.println("After day " + day + ", you lost " + deciForm.format(-earnings) + " per share." );
            }
            else {
                System.out.println("After day " + day + ", you have no earnings per share.");
            }
            day += 1;
        }
        scanny.close();
    }
}
