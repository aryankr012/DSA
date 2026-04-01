package Day_7;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {1,9,6,4,3,2,7,5,8,10,12};
		
		missingNumber(arr);
	}

	private static void missingNumber(int[] arr) {
		int max = arr[0];
		int min = arr[0];
//		Find Max Element
		for(int a : arr) {
			if(a>max) {
				max = a;
			}
		}
//		Find Min Element 
		for(int a : arr) {
			if(a<min) {
				min = a;
			}
		}
		
//		int TotalSum = (max - min + 1)/2*(min+max);
//		for(int i=min;i<=max;i++) {
//			TotalSum += arr[i];
//		}
		
		int TotalSum = (max - min + 1) * (min + max) / 2;
		
		int ArraySum = 0;
		for(int i=0;i<arr.length;i++) {
			ArraySum += arr[i];
		}
		
		System.out.println(TotalSum-ArraySum+" is Missing");
	}
}
