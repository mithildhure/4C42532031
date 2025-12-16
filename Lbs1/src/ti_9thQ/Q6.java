package ti_9thQ;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP to count the sum of numbers in a string
		
		String s = "12b3";
		int sum = 0;
		
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				int j = s.charAt(i);
				sum = sum+(j-48);
			}
		}
		
		System.out.println(sum);
		
	}

}
