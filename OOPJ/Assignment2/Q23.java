//Given a number, find whether it is odd or even using the & bitwise operator and print
//the result without using if-else.
import java.util.Scanner;
class Q23{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		if((a&1) == 0){
			System.out.println(a + " is even");
		} else {
			System.out.println(a + " is odd");
		}
	}
	
}	