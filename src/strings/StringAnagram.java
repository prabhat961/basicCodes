package strings;

import java.util.Arrays;

public class StringAnagram {
	
	public static boolean isAnagram(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		int m = arr1.length;
		int n = arr2.length;
		if(m != n)
			return false;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for( int i = 0; i < m; i++) {
			if(arr1[i] != arr2[i])
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		 if (isAnagram(str1, str2))
	            System.out.println("The two strings are"
	                    + " anagram of each other");
	        else
	            System.out.println("The two strings are not"
	                    + " anagram of each other");


	}

}
