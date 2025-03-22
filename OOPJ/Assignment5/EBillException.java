import java.util.InputMismatchException;
import java.util.Scanner;

class ElectricityBill{
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    public ElectricityBill(String customerName, double unitsConsumed) {
        if (unitsConsumed < 0){
            throw new IllegalArgumentException("Units consumed cannot be negative.");
        }
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
        this.billAmount = 0.0;
    }

    public void calculateBillAmount(){
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        }else if (unitsConsumed <= 300) {
            billAmount = (100 * 5) + ((unitsConsumed - 100) * 7);
        }else {
            billAmount = (100 * 5) + (200 * 7) + ((unitsConsumed - 300) * 10);
        }
    }

    public void displayBill(){
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill Amount: Rs. " + billAmount);
    }
}


public class EBillException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input customer details
            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();

            System.out.print("Enter units consumed: ");
            double unitsConsumed = scanner.nextDouble();

            // Create ElectricityBill object and calculate bill
            ElectricityBill bill = new ElectricityBill(customerName, unitsConsumed);
            bill.calculateBillAmount();
            bill.displayBill();

        } catch (InputMismatchException e) {
            System.out.println("Please enter a numeric value for units consumed.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
