package ti_10thQ;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP to find the length of the last word in a sentence
		
		String s = "hello world";
		int count = 0;
		
		for(int i = 0; i < s.length(); i ++) {
			
			if(s.charAt(i) == ' ') {
				break;
			}
			count++;
			
		}
		
		System.out.println(count);
		
	}

}
