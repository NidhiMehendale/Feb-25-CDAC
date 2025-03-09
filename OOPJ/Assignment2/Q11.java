//Write a program to check if a given number is a power of 2 using bitwise operators.
//Hint: n & (n - 1) == 0 for positive numbers.
import java.util.Scanner;
class Q11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		if((a & (a-1))==0)
			System.out.println(a + " is a power of two");
		else
			System.out.println(a + " is not a power of two");	
	}
	
}