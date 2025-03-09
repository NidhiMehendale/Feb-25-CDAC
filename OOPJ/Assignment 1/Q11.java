//11. Write a program to check if a number is positive and even using logical operators (&&, ||, !).
import java.util.Scanner;
class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int number = sc.nextInt();

        if (number > 0 && number % 2 == 0) {
            System.out.println(number + " is positive and even.");
        } else if (number > 0 && number % 2 != 0) {
            System.out.println(number + " is positive and odd.");
        } else {
            System.out.println(number + " is not positive.");
        }
    }
}