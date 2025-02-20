import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total purchase amount: ");
        double totalPurchase = scanner.nextDouble();

        System.out.print("Do you have a membership card? (yes/no): ");
        String hasMembershipCard = scanner.next().toLowerCase();

        double discount = 0;

        if (totalPurchase >= 1000) {
            discount = 20; 
        } else if (totalPurchase >= 500 && totalPurchase <= 999) {
            discount = 10; 
        } else if (totalPurchase < 500) {
            discount = 5; 
        }

        if (hasMembershipCard.equals("yes")) {
            discount += 5;
        }

        double discountAmount = (totalPurchase * discount) / 100;
        double finalAmount = totalPurchase - discountAmount;

        System.out.println("Bill Details");
        System.out.println("Total Purchase Amount: Rs." + totalPurchase);
        System.out.println("Discount Applied: " + discount + "%");
        System.out.println("Discount Amount: Rs." + discountAmount);
        System.out.println("Final Amount to Pay: Rs." + finalAmount);

        scanner.close();
    }
}