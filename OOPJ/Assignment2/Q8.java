//Write a program that takes three boolean inputs and prints true if at least two of them are true.
import java.util.Scanner;
class Q8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first boolean value: ");
		boolean a = sc.nextBoolean();
		System.out.println("Enter Second boolean value: ");
		boolean b = sc.nextBoolean();
		System.out.println("Enter Third boolean value: ");
		boolean c = sc.nextBoolean();
		if((a && (b||c)) || (c && (a||b)) || (b && (a||c))){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	
}	