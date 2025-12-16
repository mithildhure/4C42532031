package thridQ;

public class Q9 {

	public static int power(int base, int exp) {
		int res = 1;
		for(int i = 0; i < exp; i++) {
			res *= base; 
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bin = 1010, deci = 0, i = 0;
		
		while(bin != 0) {
			int rem = bin % 10;
			deci += rem * power(2, i);
			bin = bin / 10;
			i++;
		}
		System.out.println(deci);
		
	}

}
