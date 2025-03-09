//Q1: Write a program to swap two numbers without using a third variable and without using arithmetic operators like + or -.
class Q1{
	public static void main(String[] args){
		int a = 8;
		int b = 16;
		System.out.println("Before Swapping: \nA = " + a + "\tB = " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After Swapping: \nA = " + a + "\tB = " + b);
	}
}