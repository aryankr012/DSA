package Day_5;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 153;
		boolean res = armstrong(num);
		if(res) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a Armstrong Number");
		}
	}

	private static boolean armstrong(int num) {
		int sum = 0;
		int temp = num;
		
		while(num!=0) {
			int r = num%10;
			num /= 10;
			sum+=(r*r*r);
		}
		if(sum==temp) {
			return true;
		}
				
		return false;
		
	}
}
