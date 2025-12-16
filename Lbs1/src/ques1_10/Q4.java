package ques1_10;

public class Q4 {

	public static void main(String[] args) {
//		Check if a number is armstrong
//      armstrong is sum of the cubes of its digits is equal to the number itself
//		eg: 153
		int num = 153;
		int n = num;
		int result = 0;
		while (num != 0) {
			int remove = num % 10;
			result = result + remove * remove * remove;
			num = num / 10;
		}
		if (n == result) {
			System.out.println(n+" is an armstrong number");
		} else {
			System.out.println(n+" is not an armstrong number");
		}
	}

}
