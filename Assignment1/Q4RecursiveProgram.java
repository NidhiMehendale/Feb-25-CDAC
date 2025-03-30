class Q4RecursiveProgram{
	//1.prime
	 static boolean isPrime(int n, int divisor) {
        if (n <= 1) return false; 
        if (divisor == 1) return true; 
        if (n % divisor == 0) return false; 
        return isPrime(n, divisor - 1); 
    }
	//2.palindrome
	static boolean isPalindrome(String s){
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
		}
	//3.sum of digits
	static int sum(int n){
		if(n==0){
			return 0;
		}
			
		return n % 10 + sum(n/10);
	}
	//4.Fibonacci number
	static int fibonacci(int n){
		if(n == 0){
			return 0;
		}else if(n == 1){
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	//5.power function
	static int power(int a ,int b){
		 if(b == 0)
			return 1;
	   
	    return a * power(a,b-1);
	}
		
	public static void main(String[] args){
		//prime
		int n = 7;
		boolean prime = isPrime(n, n / 2);
		System.out.println("Is prime: " + prime);

       
		//palindrome
		String str = "racecar";  
		System.out.println("Is "+ str+ " a palindrome?: " + isPalindrome(str));
		//sum of digits
		int num = 1234;
		System.out.println("Sum of digits of " + num +": "+ sum(num));	
		//Fibonacci number
		int fibIndex = 6;
		System.out.print("fibonacci of " + fibIndex + " is: ");	

		for(int i=1;i<=fibIndex;i++){
			System.out.print(fibonacci(i)+ " ");		
		}
		System.out.println("");
		//power function
		int a = 2;
		int b = 5;
        System.out.println(a +" raised to the power " +b+ " is: " +power(a,b));
    }
		
	
}