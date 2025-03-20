//Find the Second Largest Element
class Q3{
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
		System.out.println(largest);

        for (int num : arr) {
            if (num > largest) {  
                // Update secondLargest before changing largest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) { 
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Largest: " + secondLargest);
        }
    }
}
