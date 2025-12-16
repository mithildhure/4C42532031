package ti_10thQ;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Count the occurence of each character in a string
		
		String s = "hello";
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'l') {
				count++;
			}
		}
		
		System.out.println("l occured in "+s+" "+count+" times");
		
	}

}
