package ques1_10;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check if a number is Palindrome
		// Palindrome btw 121 = 121 mirrored same		
		int num = 212;
		int n = num; // copy 
		int reverse = 0; // initialization
		while (num != 0) {
			int remove = num % 10;  // to access the last digit of a number 
				reverse = reverse * 10 + remove; // to store the digit  
				num = num / 10; // to remove the last digit 
		}
		if (n == reverse) {
			System.out.println(n+" is a palindrome");
		} else {
			System.out.println(n+" is not palindrome");
		}
		
	}

}
