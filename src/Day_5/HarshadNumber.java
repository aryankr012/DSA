package Day_5;

public class HarshadNumber {
	public static void main(String[] args) {
		int num = 18;
		harshadNumber(num);
	}

	private static void harshadNumber(int num) {
		int temp = num;
		int sum = 0;
		
		while(num!=0) {
			int r = num%10;
			num /=10;
			sum +=r;
		}
		if(temp%sum==0) {
			System.out.println("Harshad Number ");
		}
		else {
			System.out.println("Not A Harshad Number");
		}
	}
}
