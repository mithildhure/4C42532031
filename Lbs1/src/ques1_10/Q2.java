package ques1_10;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Factorial of a number
		int fact = 1;
		int num = 6;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println("Factorial of "+num+ " is: "+fact);
	}
}
