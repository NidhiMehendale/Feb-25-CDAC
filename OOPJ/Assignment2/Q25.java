//Implement a program that reverses an integer number without using string conversion (StringBuilder or toCharArray).
import java.util.Scanner;
class Q25{
	 public static void main(String me[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int rev = 0;
		int temp = n;
		while(n!=0){
			rev = rev * 10 + n % 10;
			n = n/10;
		}
		System.out.println("Reverse of " + temp + " is " + rev);
	}
}