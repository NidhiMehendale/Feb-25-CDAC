//Rotate an Array
import java.util.*;

class Q7{
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        // Reverse the entire array
        reverse(nums, 0, n - 1);
        
        //Reverse the first k elements
        reverse(nums, 0, k - 1);
        
        //Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

     static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        
        rotate(arr, k);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
