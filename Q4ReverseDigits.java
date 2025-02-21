class Q4ReverseDigits {
    public static void main(String[] args) {
        int num = 1234;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10; 
            reverse = reverse * 10 + digit; 
            num /= 10; // Remove the last digit
        }

        System.out.println("Reverse number: " + reverse);
    }
}

// Sample Output: Reverse number: 4321