//10. Write a program to compare two integers using all relational operators (==, !=, >, <, >=, <=) and display the results.
import java.util.Scanner;
class Q10{
		public static void main(String args[]){
		   Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
		
		System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));
        System.out.println(num1 + " > " + num2 + " : "  + (num1 > num2));
        System.out.println(num1 + " < " + num2 + " : "  + (num1 < num2));
        System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
        System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));
		}
}