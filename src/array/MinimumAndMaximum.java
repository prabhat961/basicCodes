package array;

public class MinimumAndMaximum {
	
	public static int printMinimum(int[] arr) {
		int min = arr[0];
		for( int i = 0; i < arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		return min;
	}
	
 public static int printMaximum(int[] arr) {
		int max = arr[0];
		for( int i = 0; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = {11, 1, 56, 87, 98, 101, 43};
		System.out.println("Minimum Element:"+printMinimum(arr));
		System.out.println("Maximum Element:"+printMaximum(arr ));
	}

}
