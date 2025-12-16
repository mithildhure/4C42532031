package secondQ;

public class Q4 {

	public static int sumOfN(int num) {
		if(num == 0) {
			return 0;
		}
		int rem = num % 10;
		return rem + sumOfN(num / 10);
		
//		OR
//		return num % 10 + sumOfN(num / 10);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Find the sum of digits of a number using recursion
		System.out.println(sumOfN(143));
		
	}

}
