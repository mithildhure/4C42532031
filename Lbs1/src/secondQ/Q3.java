package secondQ;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Convert Decimal to Binary;
//		modulus of 2
		int num = 12;
		String binary = "";
		while (num != 0) {
			int rem = num % 2;
			binary = rem+binary;
			num = num / 2;
		}
		System.out.println("Binary "+binary);
	}

}
