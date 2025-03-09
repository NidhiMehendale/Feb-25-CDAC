//12. Write a program to demonstrate the use of assignment operators (=, +=, -=, *=, /=, %=) on two integers.
class Q12{
	public static void main(String args[]){
		int a = 15;
        int b = 4;
		
		System.out.println("a += b: " + (a += b));
        System.out.println("a -= b: " + (a -= b));
        System.out.println("a *= b: " + (a *= b));
        System.out.println("a /= b: " + (a /= b));
        System.out.println("a %= b: " + (a %= b));
	}
}