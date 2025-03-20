//6. Remove Duplicates from a Sorted Array
class Q6 {
    public static int removeDuplicates(int[] arr) {
        if(arr.length == 0) return 0;

        int i = 0; 

        for(int j = 1; j < arr.length; j++) {
            if(arr[j] != arr[i]) { 
                i++;
               arr[i] = arr[j]; 
            }
        }

        return i + 1; // Length of unique elements
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int newArray = removeDuplicates(arr);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newArray; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
