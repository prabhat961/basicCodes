package array;

import java.util.Arrays;

public class arraySort {
	
	public static void sorting(int[] arr) {
		for ( int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 19, 31, 24, 98, 109, 167};
		sorting(arr);
		System.out.println(Arrays.toString(arr));


	}

}
