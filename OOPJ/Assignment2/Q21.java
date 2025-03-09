//Write a program that increments a number without using + or ++ operators.
import java.util.Scanner;
class Q21{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println(-~num);
	}
}

