package ti_10thQ;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Remove the duplicate characters from string
		
		String s = "hello";
		char[] ch = s.toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == ' ') {
				continue;
			}
			
			for(int j = i +1; j < ch.length; j++) {
				
				if(ch[i] == ch[j]) {
					ch[j] = ' ';
				}
				
			}
			
		}
		System.out.println(ch);
		
		
	}

}
