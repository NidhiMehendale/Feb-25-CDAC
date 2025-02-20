import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

      	     System.out.print("Input a number: ");
             int number = scanner.nextInt();
             int reverse = 0;

      	  while (number != 0) {
        	    int digit = number % 10;
          	    reverse = reverse * 10 + digit;
         	    number /= 10;
        }
        
             System.out.println("The reverse of  number is " + reverse);
        
       	     scanner.close();
    }
}
