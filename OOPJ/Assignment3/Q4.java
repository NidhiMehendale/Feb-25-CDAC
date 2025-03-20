// Count Even and Odd Numbers
class Q4{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int evenCount = 0, oddCount = 0;
        for(int num : arr) {
            if(num % 2 == 0) {
                evenCount++;
            }else{
                oddCount++;
            }
        }

        System.out.println("Even Count: " + evenCount);
        System.out.println("Odd Count: " + oddCount);
    }
}
