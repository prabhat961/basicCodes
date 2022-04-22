package array;

import java.util.Arrays;

public class KthSmallestAndLargest {
	
	public static int kthSmallest(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k-1];
	}
	
	public static int kthLargest(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[arr.length - k];
	}
	public static void main(String[] args) {
		int[] arr = {24, 32, 89, 107, 11, 64};
		int k = 2;
		System.out.println("kth smallest:"+kthSmallest(arr, k));
		System.out.println("kth largest:"+kthLargest(arr, k));

	}

}
