import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
        
      	     System.out.print("Input first number: ");
     	     int num1 = scanner.nextInt();
        
              System.out.print("Input second number: ");
     	      int num2 = scanner.nextInt();
        
              int sum = num1 + num2;
              int subtraction = num1 - num2;
              int multiplication = num1 * num2;
              int division = num1 / num2;
              int remainder = num1 % num2;
        
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " x " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " mod " + num2 + " = " + remainder);

        scanner.close();
    }
}
