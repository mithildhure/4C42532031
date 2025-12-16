package ti_6thQ;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Wap to find the sum of all even numbers
		int[] arr = {1,2,3,4,5,6,7,8};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}

}
