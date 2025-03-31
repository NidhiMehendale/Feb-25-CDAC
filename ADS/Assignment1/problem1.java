class problem1{
    
    // Find the second largest element 
    static int findSecondLargest(int[] arr, int largest, int secondLargest, int index) {
        if (index == arr.length) {
            return secondLargest;
        }
        if (arr[index] > largest) {
            secondLargest = largest;
            largest = arr[index];
        } else if (arr[index] > secondLargest && arr[index] != largest) {
            secondLargest = arr[index];
        }
        return findSecondLargest(arr, largest, secondLargest, index + 1);
    }
    
    // Move all zeros to the end 
    static void moveZerosToEnd(int[] arr, int index, int nonZeroIndex) {
        if (index == arr.length) {
            while (nonZeroIndex < arr.length) {
                arr[nonZeroIndex++] = 0;
            }
            return;
        }
        if (arr[index] != 0) {
            int temp = arr[nonZeroIndex];
            arr[nonZeroIndex] = arr[index];
            arr[index] = temp;
            moveZerosToEnd(arr, index + 1, nonZeroIndex + 1);
        } else {
            moveZerosToEnd(arr, index + 1, nonZeroIndex);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 0, 5, 20, 0, 8, 15};
        
        // Find the second largest element
        int secondLargest = findSecondLargest(arr, Integer.MIN_VALUE, Integer.MIN_VALUE, 0);
        System.out.println("Second largest element: " + secondLargest);
        
        // Move zeros to the end
        moveZerosToEnd(arr, 0, 0);
        System.out.print("Array after moving zeros: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
