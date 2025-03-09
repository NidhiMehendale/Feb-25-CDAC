//Write a program to determine if a character is a vowel or a consonant using the ternary operator.
import java.util.Scanner;
class Q10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char x = sc.next().charAt(0);
		char ch = Character.toLowerCase(x);
		String str = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch =='u')? x + " is a vowel." : x + " is a consonant";  
		System.out.println(str);
	}
	
	
}	