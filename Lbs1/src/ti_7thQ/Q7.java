package ti_7thQ;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP to count how many vowels in a string
		
		String s = "Raju";
		int vowelcount = 0;
		char[] ch = s.toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'
			|| ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U' ) {
				vowelcount++;
			}
		}
		
		System.out.println(vowelcount);
		
	}

}
