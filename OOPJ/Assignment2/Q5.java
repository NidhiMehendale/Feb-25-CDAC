//Write a Java program to swap two numbers using the += and -= operators only.
import java.util.Scanner;
class Q5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int x = sc.nextInt();
		System.out.println("Enter second number: ");
		int y = sc.nextInt();
		System.out.println("Before Swapping: \nX = " + x + "\nY = " + y); 
		x += y;
		y -= x;
		y = -y;
		x -= y;
		System.out.println("After Swapping: \nX = " + x + "\nY = " + y); 
	}
}
