//Implement a Java program that finds the minimum of four numbers using nested ternary operators.
import java.util.Scanner;
class Q17{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int x = sc.nextInt();
		System.out.println("Enter second number: ");
		int y = sc.nextInt();
		System.out.println("Enter third number: ");
		int z = sc.nextInt();
		System.out.println("Enter fourth number: ");
		int m = sc.nextInt();
	    int result = (x<y && x<z && x<m)? x :(z<y && z<x && z<m)? z:(y<z && y<x && y<m)? y : m;
		System.out.println("Minimum number is: " + result);
	}
}