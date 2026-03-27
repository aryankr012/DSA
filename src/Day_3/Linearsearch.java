package Day_3;

public class Linearsearch {

	public static void main(String[] args) {
		int[] arr = {2,7,5,6,9,7};
		int key = 7;
		findElement(arr,key);
	}

	private static void findElement(int[] arr, int key) {
		boolean flag = false;
		for(int a :arr) {
			if(key==a) {
				System.out.println("Element "+ key+" Found");
				flag = true;
				return;
			}
		}
		if(!flag) {
			System.out.println("Element "+ key+ " Not Found");
		}
	}
}
