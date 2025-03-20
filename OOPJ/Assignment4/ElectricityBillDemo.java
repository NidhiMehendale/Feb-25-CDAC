import java.util.Scanner;

class ElectricityBill{
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    public ElectricityBill(String customerName, double unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
        this.billAmount = 0.0; // Initial value
    }

    public void calculateBillAmount(){
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else if (unitsConsumed <= 300) {
            billAmount = (100 * 5) + ((unitsConsumed - 100) * 7);
        } else {
            billAmount = (100 * 5) + (200 * 7) + ((unitsConsumed - 300) * 10);
        }
    }

    public void displayBill(){
        System.out.println("\n--- Electricity Bill Details ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed + " units");
        System.out.printf("Total Bill Amount: ₹%.2f%n", billAmount);
    }
}

public class ElectricityBillDemo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the number of units consumed: ");
        double units = scanner.nextDouble();

        ElectricityBill bill = new ElectricityBill(name, units);

        bill.calculateBillAmount();

        bill.displayBill();

    }
}
