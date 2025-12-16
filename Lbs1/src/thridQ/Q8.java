package thridQ;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Decimal to Hexa
		char[] hexa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		String hex = "";
		int num = 77;
		
		while(num != 0) {
			int rem = num % 16;
			hex = hexa[rem]+hex;
			num = num / 16;
		}
		System.out.println(hex);
	}

}
