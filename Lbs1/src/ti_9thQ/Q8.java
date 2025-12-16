package ti_9thQ;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP to replace a specific character from a string
		
		String s = "hello";
		char[] ch = s.toCharArray();
		char replace = 'e';
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == replace) {
				ch[i] = 'o';
			}
		}
		
		System.out.println(ch);
		
	}

}
