public class Anagrams{
	public static boolean areAnagrams(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		int arr[] = new int[26];
		for(int i=0; i<str1.length(); i++){
			arr[str1.charAt(i) - 'a']++; 
			arr[str2.charAt(i) - 'a']--;
		}

		for(int count : arr){
			if(count != 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		String str1 = "listen";
		String str2 = "silent";
		
		if(areAnagrams(str1, str2)){
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		}else{
			System.out.println(str1 + " and " + str2 + " are nOT anagrams.");
		}
	}
}