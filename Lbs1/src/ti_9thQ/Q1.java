package ti_9thQ;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Check if 2 string are equal or not
		
		String s1 = "hello";
		String s2 = "hellq";
		
		if (s1.length() == s2.length()) {
			boolean isEqual = true;
			for(int i = 0; i < s1.length(); i++) {
				if(s1.charAt(i) != s2.charAt(i)) {
					isEqual = false;
					break;
				}
			}
			
			if (isEqual) {
				System.out.println(s1+" and "+s2+" are equal");
			} else {
				System.out.println("are not equal");
			}
		} else {
			System.out.println("Not Equal");
		}
	}

}
