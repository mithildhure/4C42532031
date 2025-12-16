package ti_10thQ;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Convert a string to uppercase and lowercase;
		
		String s = "Hello", upper = "", lower = "";
		char[] ch = s.toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			
			if(ch[i] >= 'a' && ch[i] <= 'z') {
				
				upper += (char) (ch[i] - 32);
				lower += ch[i];
			}
			
			if(ch[i]>= 'A' && ch[i] <= 'Z') {
				
				lower += (char) (ch[i] +32 );
				upper += ch[i];
			}
			
		}
		
		System.out.println(s+" in lower: "+lower+" , and upper :"+upper);
		
	}

}
