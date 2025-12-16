package ti_8thQ;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Find the first non repeated character in a word
		
		String s = "hello";
		char[] ch = s.toCharArray();
		boolean isNonRep = true;
		
		for(int i = 0; i < ch.length; i++) {
			
			for(int j = 0; j < ch.length; j++) {
				if(i != j && ch[i] == ch[j]) {
					isNonRep = false;
					break;
				}
			}
			
			if (isNonRep) {
				System.out.println(ch[i]);
				break;
			} else {
				System.out.println("invalid");
			}
		}
		
	}

}
