//Write a Java program to multiply a number by 8 without using * or / operators.
//Hint: Use bitwise left shift (<<).
import java.util.Scanner;
class Q12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		int result = a << 3;
		System.out.println(result);
	}
}	