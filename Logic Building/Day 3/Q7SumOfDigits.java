class Q7SumOfDigits {
    public static void main(String[] args) {
        int num = 9876;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10; 
            sum += digit; 
            num /= 10; 
        }
        System.out.println("Sum of the digits: " + sum);
    }
}
// Sample Output: Sum of the digits: 30