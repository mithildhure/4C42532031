package ti_10thQ;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		How to convert byte array into string
		
		byte[] by = {97,110,67,97};
		String s = "";
		
		for(int i = 0; i < by.length; i++) {
			s = s+(char) by[i];
		}
		
		System.out.println(s);
		
	}
	

}
