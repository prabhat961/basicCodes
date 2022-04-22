package strings;

import java.util.HashSet;
import java.util.Set;

public class ReMoveDuplicate {
	public static void printUnique(String str) {
		Set<Character>un = new HashSet<>();
		for(int i = 0; i < str.length(); i++) {
			un.add(str.charAt(i));
		}
		for (char a : un) {
			System.out.print(a + " ");
		}
	}

	public static void main(String[] args) {
		String str = "malyalam";
		printUnique(str);
	}

}
