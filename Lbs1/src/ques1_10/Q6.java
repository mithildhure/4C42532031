package ques1_10;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// GCD(Greatest Common Divisor)		
		int n1 = 14;
		int n2 = 21;
		int gcd = 0;
		
		for (int i = 1; i < n1 && i < n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println("GCD of "+n1+" and "+n2+" : "+gcd);
	}

}
