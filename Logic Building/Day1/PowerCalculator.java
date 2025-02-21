import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        
         System.out.print("Input base number: ");
         double base = scanner.nextDouble();

        System.out.print("Input exponent numbert: ");
        int exponent = scanner.nextInt();
        
       int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println(base + " raised to the power " + exponent + " is " + result);
	scanner.close();
    }
}
