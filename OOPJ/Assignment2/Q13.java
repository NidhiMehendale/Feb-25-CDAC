//Implement a Java program to find the absolute value of an integer using bitwise operators.
import java.util.Scanner;
class Q13{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int mask = num >> 31; 
		int abs = (num + mask) ^ mask;
		System.out.println(abs);
	}
}	