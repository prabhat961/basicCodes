package array;

public class chkElement {
	
	public static boolean isPresent( int[] arr, int x) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == x) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
	        int n = 8;
	        System.out.println("element present:" + isPresent(arr, n));

	}

}
