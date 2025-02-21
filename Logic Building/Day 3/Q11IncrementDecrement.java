class Q11IncrementDecrement {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int result = ++b + --a + a++ + --b;

        System.out.println("result = " + result);
    }
}
// Sample Output:
// result = 13
