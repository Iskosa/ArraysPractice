
package homework;
import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter total purchase amount: ");
        double total = reader.nextDouble();

        System.out.println("Are you premium member?");
        String premium = reader.next();

        System.out.println("Number of previous orders: ");
        int numberOrder = reader.nextInt();

        System.out.println("Do you have a discount coupon? ");
        String coupon = reader.next();

        System.out.println("Is it your birthday month?");
        String birthday = reader.next();

        if (total >= 200 && (premium.equals("yes") || coupon.equals("yes") || birthday.equals("yes"))) {
            total = total - (total * 0.2);
            System.out.println("Your total is:" + total + " with 20% discount");
        } else if (total >= 150 && premium.equals("yes") || numberOrder >= 10) {
            total = total - (total * 0.15);
            System.out.println("Your total is:" + total + " with 15% discount");
        } else if (total >= 100 && coupon.equals("yes")) {
            total = total - (total * 0.1);
            System.out.println("Your total is:" + total + " with 10% discount");
        } else {
            System.out.println("Your total is:" + total + " without discount");
        }
    }
}