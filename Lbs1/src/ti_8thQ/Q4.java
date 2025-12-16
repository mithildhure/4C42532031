package ti_8thQ;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Print repetive characters in a string
		
		String s = "hello  world";
		
		char[] ch = s.toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			int count = 0;
			
			if(ch[i] == ' ') {
				continue;
			}
			
			for(int j = i+1; j < ch.length-1; j++ ) {
				if(ch[i] == ch[j+1]) {
					count++;
					ch[j] = 0;
				}
			}
			
			if(count > 1) {
				System.out.println(ch[i]+" is repeated "+count+" times");
			}
			
		}
		
	}

}
