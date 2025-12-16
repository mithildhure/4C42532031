package ti_9thQ;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP to split a string
		String s = "hello world";
		int count = 1;
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == ' ') {
				count++;
			}
		}
		
		String[] arr = new String[count];
		String new_str = "";
		int index = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' ') {
				new_str += s.charAt(i); 
			}
			if(s.charAt(i) == ' ') {
				arr[index] = new_str;
				index++;
				new_str = "";
			}
			if(i == s.length() - 1) {
				arr[index] = new_str;
			}
		}
		
		
	}

}
