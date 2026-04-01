package Day_6;

public class PowerFunction {

	public static void main(String[] args) {
		int base = 2;
		int power = 3;
		powerFunction(base,power);
	}

	private static void powerFunction(int base, int power) {
		int res = 1;
		for(int i=0;i<power;i++) {
			res *= base;
		}
		System.out.println(base+" power "+power+" is "+ res);
	}
}
