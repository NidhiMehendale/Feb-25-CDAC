//Q2: Write a program to check whether a given number is even or odd using only bitwise operators.
import java.util.Scanner;
class Q2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");	
		int a = sc.nextInt();
		if((a&1) == 0){
			System.out.println(a + " is even");
		} else {
			System.out.println(a + " is odd");
		}
	}
	
}