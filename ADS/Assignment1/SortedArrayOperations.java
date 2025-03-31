class SortedArrayOperations{
    
    // Binary Search 
     static int binarySearch(int[] arr, int key, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key){
            return binarySearch(arr, key, left, mid - 1);
        } else {
            return binarySearch(arr, key, mid + 1, right);
        }
    }
    
    // First Occurrence 
    static int firstOccurrence(int[] arr, int key, int left, int right){
        if (left > right){
            return -1;
        }
        int mid = left + (right - left) / 2;
        if ((mid == 0 || key > arr[mid - 1]) && arr[mid] == key){
            return mid;
        } else if (arr[mid] >= key){
            return firstOccurrence(arr, key, left, mid - 1);
        } else {
            return firstOccurrence(arr, key, mid + 1, right);
        }
    }
    
    // Last Occurrence 
    static int lastOccurrence(int[] arr, int key, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if ((mid == arr.length - 1 || key < arr[mid + 1]) && arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return lastOccurrence(arr, key, left, mid - 1);
        } else {
            return lastOccurrence(arr, key, mid + 1, right);
        }
    }
    
    static int countOccurrences(int[] arr, int key) {
        int first = firstOccurrence(arr, key, 0, arr.length - 1);
        if (first == -1) {
            return 0; // Key not found
        }
        int last = lastOccurrence(arr, key, 0, arr.length - 1);
        return last - first + 1;
    }
    
    // Find a Peak Element 
    static int findPeak(int[] arr, int left, int right) {
        int mid = left + (right - left) / 2;
        if ((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] >= arr[mid + 1])) {
            return arr[mid];
        }
        if (mid > 0 && arr[mid - 1] > arr[mid]) {
            return findPeak(arr, left, mid - 1);
        } else {
            return findPeak(arr, mid + 1, right);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 5, 6, 8};
		int key = 3;
        
        // Searching for key
        int index = binarySearch(arr, key, 0, arr.length - 1);
        System.out.println("Index of " + key + ": " + index);
        
        // Finding first and last occurrence
        int first = firstOccurrence(arr, key, 0, arr.length - 1);
        int last = lastOccurrence(arr, key, 0, arr.length - 1);
        System.out.println("First occurrence : " + first);
        System.out.println("Last occurrence : " + last);
        
        // Counting occurrences
        System.out.println("Total count of key:" + countOccurrences(arr, key));
        
        // Finding a peak element
        System.out.println("A peak element: " + findPeak(arr, 0, arr.length - 1));
    }
}
