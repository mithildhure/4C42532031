package ti_10thQ;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP to find shortest distance to a character
		
		String s = "hello world";
		int left = 0, right = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'l') {
				break;
			}
			left++;
		}
		
		for(int j = s.length()-1; j >= 0; j--) {
			if(s.charAt(j) == 'l') {
				break;
			}
			right++;
		}
		
		if(right > left) {
			System.out.println("shortest distance to 'l' is "+left);
		}
		else {
			System.out.println("shortest distance to 'l' is "+right);
		}
		
	}

}
