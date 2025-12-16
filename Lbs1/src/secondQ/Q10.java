package secondQ;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAp to find sum of even numbers between given range
		int range = 10;
		int sum = 0;
		for(int i = 2; i <= range; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
	}

}
