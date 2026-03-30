package Day_4;

public class SumOfDigit{

	public static void main(String[] args) {
//		int num = 133;
		String num = "83437589341";
		
		sumOfDigit(num);
	}

	private static void sumOfDigit(int num) {
		int sum = 0;
		while(num!=0) {
			int r = num % 10;
			num /= 10;
			sum += r;
			
		}
		System.out.println("Sum "+sum);
	}
	private static void sumOfDigit(String num) {
		int sum = 0;
		while(num.length()!=0) {
			char digit = num.charAt(0);
			Integer res = Integer.valueOf(digit);
			sum += res-48;
			num = num.substring(1);
		}
		System.out.println(sum);
	}
	
}
