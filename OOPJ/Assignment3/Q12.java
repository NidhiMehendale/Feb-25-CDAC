//Write a program to accept 20 integer numbers in a single Dimensional Array. Find and Display the following:
// Number of even numbers.
//Number of odd numbers.
//Number of multiples of 3

import java.util.Scanner;
class Q12{
	public static void main(String ...args){
		int numbers[] = new int[20];
		getInput(numbers);
		System.out.println("Even count: " + countEven(numbers));
		System.out.println("Odd count: " + countOdd(numbers));
		multipleOfThree(numbers);	
	}
	
	public static void getInput(int[] arr){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an input: ");
		for (int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}	
	}
	
	public static int countEven(int[] nums){
		int count=0;
		for(int i=0; i<nums.length; i++){
			if(nums[i]%2==0){
				count++;
			}
		}
		return count;
	}
	
	public static int countOdd(int[] nums){
		int count=0;
		for(int i=0; i<nums.length; i++){
			if(nums[i]%2==1){
				count++;
			}
		}
		return count;
	}
	
	public static void multipleOfThree(int[] nums){
		for(int i=0; i<nums.length; i++){
			if(nums[i]%3==0 && nums[i] !=0)
				System.out.print(nums[i] + " ");	
		}
	}	
}