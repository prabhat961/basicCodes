package strings;

import java.util.Scanner;

public class UserInput {
	public static void getUserInput(String str) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Word:");
		str = input.next();
		System.out.println("User hase entered:"+str);
	}

	public static void main(String[] args) {
		String Name =" ";
		getUserInput(Name);

	}

}
