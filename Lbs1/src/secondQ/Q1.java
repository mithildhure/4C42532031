package secondQ;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LCM = (n1 * n2) / gcd
		int n1 = 7;
		int n2 = 14;
		int gcd = 0;
		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		int lcm = (n1 * n2)/gcd;
		System.out.println(lcm);
	}

}
