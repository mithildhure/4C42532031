package ti_8thQ;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Remove spaces in a string
		
		String s = "hello world";
		String n_s = "";
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' ') {
				n_s += s.charAt(i);
			}
		}
		
		System.out.println(n_s);
	}

}
