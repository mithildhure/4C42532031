package ti_10thQ;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Remove a given char from string
		
		String s = "hello", new_str = "";
		char target = 'e';
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) != target) {
				new_str += +s.charAt(i); 
			}
			
		}
		System.out.println(new_str);
		
	}

}
