package ti_8thQ;

public class Q3 {
	public static void reverMeth(char[] ch, int i, int j) {
		while(i <= j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			
			i++;
			j--;
		}
	}
	public static void main(String[] args) {
//		Reversing the order of words in a sentence
		String s = "hello hello world";
		char[] ch = s.toCharArray();
		reverMeth(ch, 0, ch.length-1);
		int i = 0;
		for(int j = 0; j < ch.length; j++) {
			if(ch[j] == ' ') {
				reverMeth(ch, i, j-1);
				i = j+1;
			}
			
			if (j == ch.length-1) {
				reverMeth(ch, i, j);
			}
		}
		System.out.println(ch);
		
	}

}
