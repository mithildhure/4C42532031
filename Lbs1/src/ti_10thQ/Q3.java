package ti_10thQ;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP to check wether a character is vowel consonant
		
		char check = 'a';
		
		if(check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u' 
		|| check == 'A' || check == 'E' || check == 'I' || check == 'O' || check == 'U') {
			System.out.println(check+" is Vowel");
		}
		else if((check >= 'a' && check <= 'z') || (check >= 'A' && check <= 'Z')) {
			System.out.println(check+" is Consonant");
		}
		else {
			System.out.println("neither vowel not consonant");
		}
		
	}

}
