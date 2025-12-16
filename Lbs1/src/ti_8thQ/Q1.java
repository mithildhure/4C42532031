package ti_8thQ;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP to find the number of a substring in a string
		String s = "banana",sub_str = "ana";
		
		int count = 0;

		for(int i = 0; i <= s.length()-sub_str.length(); i++) {
			boolean isMatch = true;
			for(int j = 0; j < sub_str.length(); j++) {
				if(s.charAt(i+j) != sub_str.charAt(j)) {
					isMatch = false;
					break;
				}
			}
			if(isMatch) {
				count++;
			}
			
		}
		
		System.out.println(sub_str+" came in "+s+" "+count+" times");
		
	}

}
