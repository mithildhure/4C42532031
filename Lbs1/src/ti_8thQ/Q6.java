package ti_8thQ;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sort the characters of a given string
		
		String s = "hello";
		
		char[] ch = s.toCharArray();
		
		for(int i = 0; i < ch.length-1; i++) {
			if(ch[i] > ch[i+1]) {
				char temp = ch[i];
				ch[i] = ch[i+1];
				ch[i+1] = temp;
			}
		}
		
		System.out.println(ch);
		
	}

}
