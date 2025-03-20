// Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order 
//i.e. fill A with first p smallest elements and fill B with remaining elements.
import java.util.Arrays;
class Q16{
	public static void main(String[] args){
		int[] A = {1, 5, 6, 7, 8, 10}; 
		int[] B = { 2, 4, 9 };
		int[] res = new int[A.length];
		int i = 0, j = 0, track = 0; 
		while(track<res.length){
			if(A[i]<B[j]){
				res[track++] = A[i++];
			} else {
				res[track++] = B[j++];
			}
		}
		track = 0;
		while(j<B.length){
			B[track++] = B[j++];
		}
		while(i<A.length){
			B[track++] = A[i++];
		}
		System.out.println(Arrays.toString(res));
		System.out.println(Arrays.toString(B));	
	}
}