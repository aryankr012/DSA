package Day_3;

public class MaxAndMinElements {

	public static void main(String[] args) {
		int[] arr = {3,5,3,1,4,6,7,3};
		
		maxElement(arr);
	}

	private static void maxElement(int[] arr) {
		int max = arr[0];
		
		for(int a : arr) {
			if(a>max) {
				max=a;
			}
		}
		System.out.println("Max Element : "+max);
	}
}
