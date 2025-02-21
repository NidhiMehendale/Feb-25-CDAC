class Q5FibonacciSequence {
    public static void main(String[] args) {
        int first = 0, second = 1;
        System.out.print("Fibonacci sequence up to 21: ");

        while (first <= 21) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
// Sample Output: Fibonacci sequence up to 21: 0 1 1 2 3 5 8 13 21