package ques1_10;

public class Q5 {
	public static void main(String[] args) {
//		Fibonacci series
//		fibonacci is a type of series where each number is the sum of the two that precede it
	
		int num = 8;
		int n1 = 0;
		int n2 = 1;
		
		System.out.println("fibonacci series upto "+ num+" term");
		for (int i = 1; i <= num; i++) {
			System.out.print(n1+ " ");
			int n3 = n1 + n2;
			
			n1 = n2;
			n2 = n3;
			
		}
}
}
