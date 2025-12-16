package ti_8thQ;

public class Q5 {

	public static char toUppar(char ch) {
		if(ch >= 'a' && ch <= 'z') {
			int num = ch;
			ch = (char) (num-32);
		}
		return ch;
	}
	
	public static void main(String[] args) {
//		Capitalize the first and the last character of each word of a string
		String s = "hello world";
		char[] ch = s.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			if(i == 0 || i == ch.length-1) {
				ch[i] = toUppar(ch[i]);
			}
			if(ch[i] == ' ') {
				ch[i-1] = toUppar(ch[i-1]);
				ch[i+1] = toUppar(ch[i+1]);
			}
		}
		System.out.println(ch);
	}

}
