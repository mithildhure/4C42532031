package ti_9thQ;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP for camel case pattern matching
		
		String s = "helloWorld";
		boolean isCamel = false;
		if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
			
			for(int i = 1; i < s.length(); i++) {
				if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
					isCamel = true;
					break;
				}
			}
			
		}
		
		if(isCamel) {
			System.out.println("it is camel case");
		}else {
			System.out.println("Not Camel Case");
		}
		
		
	}

}
