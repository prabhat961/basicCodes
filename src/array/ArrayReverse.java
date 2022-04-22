package array;

import java.util.Arrays;

public class ArrayReverse {
	
	public static void reverse( int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while( start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 19, 31, 24, 98, 109, 167};
		reverse(arr);
		System.out.println(Arrays.toString(arr));

	}

}
