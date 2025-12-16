package thridQ;

public class Q6 {

	public static int sum(int num) {
		if(num == 1) {
			return 1;
		}
		return num + sum(num - 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Wap to find the sum of natural number using recursion
		System.out.println(sum(6));
	}	

}
