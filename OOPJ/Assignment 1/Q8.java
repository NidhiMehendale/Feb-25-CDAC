//8. Write a program to perform addition, subtraction, multiplication, division, and modulus operations on two integer numbers and display the results.
import java.util.Scanner;
class Q8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		System.out.println("Addition is:" + (n1 + n2));
		System.out.println("Subtraction is:" + (n1 - n2));
		System.out.println("Multiplication is:" + (n1 * n2));
		System.out.println("Division is:" + (n1 / n2));
		System.out.println("Modulus is:" + (n1 % n2));	
		
	}

}