package ti_8thQ;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Check if string contains only digits
		
		String s = "12b3";
		boolean isDigit = true;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				isDigit = true;
			}
			else {
				isDigit = false;
				break;
			}
		}
		if(isDigit) {
			System.out.println("it contains only numbers");
		}
		else {
			System.out.println("contains both");
		}
		
	}

}
