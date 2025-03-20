//Merge Two Sorted Arrays
import java.util.*;

public class Q8{
    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;

            while (j < (n + m)) {
                if (j < n && arr1[i] > arr1[j]) {
                    // Swap within arr1
                    swap(arr1, i, j);
                } else if (j >= n && i < n && arr1[i] > arr2[j - n]) {
                    // Swap between arr1 and arr2
                    int temp = arr1[i];
                    arr1[i] = arr2[j - n];
                    arr2[j - n] = temp;
                } else if (j >= n && i >= n && arr2[i - n] > arr2[j - n]) {
                    // Swap within arr2
                    swap(arr2, i - n, j - n);
                }
                i++;
                j++;
            }
            
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};

        merge(arr1, arr2);
        System.out.println("Merged Array 1: " + Arrays.toString(arr1));
        System.out.println("Merged Array 2: " + Arrays.toString(arr2));
    }
}
