package ti_10thQ;

public class Q10 {

	public static boolean isVowel(char ch) {
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' 
		|| ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Count the number of words that start with a vowel in a string
		
		String s = "An Apple A Day keeps The Doctor Away";
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == 0 && isVowel(s.charAt(i))) {
				count ++;
			}
			
			if(s.charAt(i) == ' ' && i+1 <s.length() && isVowel(s.charAt(i+1)) ) {
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}

}
