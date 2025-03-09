//Implement a program to swap odd and even bits of a number using bitwise operators.
class Q15{
	public static void main(String[] args){
		int x=9;
		int evenBits = (x & 0xAAAAAAAA) >> 1; // Get even bits and shift right
        int oddBits = (x & 0x55555555) << 1;   // Get odd bits and shift left
        int res = (evenBits | oddBits);   
		System.out.println(res);
	} 
	
}	