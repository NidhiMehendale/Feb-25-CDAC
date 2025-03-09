//Write a program that determines whether a given number is positive, negative, or zero using only the ternary operator.
import java.util.Scanner;
class Q16{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		String result = (x==0)? "zero" : (x>0)? "positive" : "negative";
		System.out.println(result);
	}
}	
