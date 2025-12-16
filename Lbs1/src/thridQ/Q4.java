package thridQ;

public class Q4 {
	
	public static int fact(int num) {
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result =  result * i;
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 145;
		int sum = 0;
		int num = n;
		
		while (n != 0) {
			int rem = n % 10;
			sum = sum + fact(rem);
			n = n / 10;
		}
		if (sum == num) {
			System.out.println(num+" is a strong number");
		} else {
			System.out.println(num+" is not a strong number");
		}
	}

}
