// Write a Java program that checks whether a character is uppercase, lowercase, or not a letter using only the ternary operator.
import java.util.Scanner;
class Q19{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
	    int a = (int)ch;
		String result = (a>64 && a<91)? "Uppercase" : (a>96 && a<123)? "Lowercase" : "Not a character";
		System.out.println(result);
	}
}
