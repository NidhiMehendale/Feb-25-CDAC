//1. Find the Largest and Smallest Element

class Q1{
	public static void main(String[] args){
		int[] arr = {6,2,3,4,25,5,8};
		
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++){
			if(min>arr[i])
				min = arr[i];
		}
		
		for(int i=0; i<arr.length; i++){
			if(max<arr[i])
				max = arr[i];
		}
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}
}
