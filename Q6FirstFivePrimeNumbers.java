class Q6FirstFivePrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        int num = 2; 
          System.out.println("First 5 prime numbers:");
          while (count < 5) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }
}
// Sample Output:
// First 5 prime numbers:
// 2 3 5 7 11