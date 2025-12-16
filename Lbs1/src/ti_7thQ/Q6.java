package ti_7thQ;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP to check if 2 string are anagram
		String s1 = "silent", s2 = "listen";
		if(s1.length() == s2.length()) {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
//			bubble sort		
			for(int i = 0; i < ch1.length; i++) {
				for(int j = 0; j < ch1.length - 1; j++) {
					if(ch1[j] > ch1[j+1]) {
						char temp = ch1[j];
						ch1[j] = ch1[j+1];
						ch1[j+1] = temp;
					}
					if(ch2[j] > ch2[j+1]) {
						char temp = ch2[j];
						ch2[j] = ch2[j+1];
						ch2[j+1] = temp;
					}
				}
			}	
			boolean isAnag = true;
			for(int i = 0; i < ch1.length; i++) {
				if(ch1[i] != ch2[i]) {
					isAnag = false;
					break;
				}
			}
			if (isAnag) {
				System.out.println("It is an anagram");
			} else {
				System.out.println("Not an anagram");
			}	
		}else {
			System.out.println("not anagram");
		}
		
	}

}
