package ques1_10;

public class Q8 {

	public static void main(String[] args) {
		
		int num = 64;
		boolean isPerfectSquare = false;
		int res;
		for (int i = 1; i <= num; i++) {
			res = i * i;
			if (res == num) {
				isPerfectSquare = true;
			}
		}
		if (isPerfectSquare) {
			System.out.println("Yes its a perfect quare");
		} else {
			System.out.println("not a perfect square");
		}
	}

}
