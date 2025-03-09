//Given a student’s percentage, print “Pass” if the percentage is 40 or above; otherwise, print “Fail”, using only the ternary operator.
import java.util.Scanner;
class Q18{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int p = sc.nextInt();
		String result = (p>=40)? "Pass" : "Fail";
		System.out.println(result);	
	}
}

