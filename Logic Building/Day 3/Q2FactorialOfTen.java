class Q2FactorialOfTen {
    public static void main(String[] args) {       
        long factorial = 1;
            for (int i = 1; i <= 10; i++) {
                factorial *= i; 
            }
            System.out.println("The factorial of  10 is: " + factorial);
    }
}

//Sample output: The factorial of  10 is: 3628800
