package thridQ;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP to convert from decimal to octal;
		int num = 16;
		String octal = "";
		while (num != 0) {
			int rem = num % 8;
			octal = rem+octal;
			num = num / 8;
		}
		System.out.println(octal);
	}

}
