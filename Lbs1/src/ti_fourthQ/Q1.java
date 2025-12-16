package ti_fourthQ;

public class Q1 {

//	method to check if num is prime
	public static boolean isPrime(int num) {
		for(int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP to find the sum of all prime number betweem given range
		int start = 2;
		int end = 20;
		int sum = 0;
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		System.out.println("Sum of prime numbers from: "+start+", till: "+end+" = "+sum);
		
	}

}
