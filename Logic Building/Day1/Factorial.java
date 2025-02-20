import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = scanner.nextInt();
       
        long factorial = 1;
        
        if (num < 0) {
            System.out.println("Please enter positive number");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i; 
            }
            System.out.println("The factorial of " + num + " is: " + factorial);
        }

        scanner.close();
    }
}
