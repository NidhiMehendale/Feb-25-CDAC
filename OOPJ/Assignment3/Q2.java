//2. Reverse an Array
class Q2{
	public static void main(String[] args){
		int arr[] = {1,2,3,4,5};
		int low = 0, high = arr.length-1;
		
		System.out.println("Original: ");
		for(int n : arr){
			System.out.print(n + " ");
		}
		
		 while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            
            low++;
            high--;
        }
		
		System.out.println("\nReverse Array: ");
		for(int n : arr){
			System.out.print(n + " ");
		}
	}
}