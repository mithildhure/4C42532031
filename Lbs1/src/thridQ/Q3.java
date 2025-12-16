package thridQ;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Automorphic number
		
		int n = 6;
		int square = n*n;
		
		if (square % 10 == n) {
			System.out.println("yes it is automorphic");
		} else {
			System.out.println("Not");
		}
		
	}

}
