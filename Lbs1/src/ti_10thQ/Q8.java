package ti_10thQ;

public class Q8 {

	public static boolean isPal(String s, int i, int j) {
		
		if(i >= j) {
			return true;
		}
		
		if(s.charAt(i) != s.charAt(j)) {
			return false;
		}
		
		return isPal(s, i+1, j-1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Check if a string is palindrome using recursion
		
		System.out.println(isPal("racecar",0,6));
		
	}

}
