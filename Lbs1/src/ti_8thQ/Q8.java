package ti_8thQ;

public class Q8 {

	public static void main(String[] args) {
//    Parenthesis checker
		
		String s = "(a+b))";
		
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(count < 0) {
				System.out.println("Parenthesis Missing");
				break;
			}
			if (s.charAt(i) == '(') {
				count++;
			}
			if (s.charAt(i) == ')') {
				count--;
			}
		}
		
		if (count == 0) {
			System.out.println("Correct");
		}else {
			System.out.println("incorrect");
		}

	}

}
