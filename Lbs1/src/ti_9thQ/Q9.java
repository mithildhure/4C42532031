package ti_9thQ;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP to check if a string contains another string
		
		String s1 = "banana", s2 = "ana";
		boolean isContain = true;
		
		for(int i = 0; i < s1.length() - s2.length(); i++) {
			boolean isMatch = true;
			for(int j = 0; j < s2.length(); j++) {
				if(s1.charAt(i+j) != s2.charAt(j)) {
					isMatch = false;
					break;
				}
			}
			if(isMatch) {
				isContain = true;
				break;
			}
		}
		
		if(isContain) {
			System.out.println(s2+" contains in "+s1);
		}else {
			System.out.println(s2+" not contains in "+s1);
		}
		
		
	}

}
