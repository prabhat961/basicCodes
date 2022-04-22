package strings;

public class StringReverse {
	public static void printReverse(String str) {
		str = str.toLowerCase();
		System.out.println("Original String is:"+ str);
		String rev = " ";
		for( int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Reversed String is:"+ rev);
		
	}

	public static void main(String[] args) {
		printReverse("Chitra");

	}

}
