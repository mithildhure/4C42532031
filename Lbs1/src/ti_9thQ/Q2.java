package ti_9thQ;

public class Q2 {

	public static void reverseString(char[] ch, int i, int j) {
		
		while(i <= j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Reverse a String
		
		String s = "hello";
		char[] ch = s.toCharArray();
		
		reverseString(ch, 0, ch.length-1);
		
		System.out.println(ch);
		
	}

}
