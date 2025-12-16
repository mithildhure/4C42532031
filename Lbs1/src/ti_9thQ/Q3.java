package ti_9thQ;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP to count the number of words in a string
		
		String s = "hello world world hello";
		int count = 1;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		
		System.out.println(count+" words");
		}
		
	}


