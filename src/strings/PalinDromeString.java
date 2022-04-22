package strings;

public class PalinDromeString {
	public static boolean isPalindrome(String str) {
		char[] arr = str.toCharArray();
		int start = 0;
		int end = arr.length - 1;
		if(arr[start] != arr[end]) {
			return false;
		}
		start++;
		end--;
		return true;
	}

	public static void main(String[] args) {
		String str = "malayalam";
		System.out.println("The given String is Palindrom:"+isPalindrome(str));

	}

}
