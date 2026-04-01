package Day_6;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 6;
		int res = fibonacciSeries(n);
		System.out.println("Fibonacci of "+n+" is "+res);
	}

	private static int fibonacciSeries(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return fibonacciSeries(n-1)+fibonacciSeries(n-2);
	}
}
