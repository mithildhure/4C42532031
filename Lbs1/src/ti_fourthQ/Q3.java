package ti_fourthQ;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// WAP to reverse digits of number;
		
		int num = 45631;
		int rev = 0;
		
		while(num != 0) {
			rev = rev * 10 + (num % 10);
			num /= 10;
		}
		
		System.out.println(rev);
	}

}
