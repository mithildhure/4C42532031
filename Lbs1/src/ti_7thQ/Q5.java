package ti_7thQ;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP to check whether a string is palindrome or not
		
		String s = "level";
		boolean isPalin = true;
		
		int i = 0, j = s.length() - 1;
		
		while(i <= j) {
			if(s.charAt(i) != s.charAt(j)) {
				isPalin = false;
				break;
			}
			i++;
			j--;
		}
		
		if (isPalin) {
			System.out.println(s+" is palindrome");
		} else {
			System.out.println(s+" is not palindrome");
		}
		
	}

}
