package ques1_10;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Leap year or not
		
		int num = 1900;
		
		if ((num % 400 == 0)||(num % 4 == 0 && num % 100 != 0)) {
			System.out.println("leap year");
		} else {
			System.out.println("not leap year");
		}
		
	}
}
