package secondQ;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Nmber of times x digit occurs;
		int x = 3;
		int num = 3456323;
		int count = 0;
		while (num != 0) {
			int rem = num % 10;
			if (x == rem) {
				count++;
			}
			num /= 10;
		}
		System.out.println(count);
		
	}

}
