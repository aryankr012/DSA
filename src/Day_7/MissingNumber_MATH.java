package Day_7;

public class MissingNumber_MATH {

	public static void main(String[] args) {
		int[] arr = {2,9,6,2,4,3,2,7,5,8,10,12};
		
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
		for(int i=min;i<=max;i++) {
			boolean flag = false;
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				System.out.println(i+" is Missing");
			}
		}
	}
}
