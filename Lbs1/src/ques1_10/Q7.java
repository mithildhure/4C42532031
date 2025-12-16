package ques1_10;

public class Q7 {

	public static void main(String[] args) {
		
//		find the sum of digits of a number
		
		int num = 81;
		int sum = 0;
		int n = num;
		while (num != 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("sum of "+n+" is "+sum);
		
	}
}
