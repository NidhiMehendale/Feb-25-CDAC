//Implement a Java program that checks if a number is within a specific range (20 to 50) without using if-else.
import java.util.Scanner;
public class Q9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
	    System.out.println((a>=20 && a<=50)? a + " is in the range." : a + " is not in range");

	}
	
	 
}	