package ti_6thQ;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Wap to find the average of numbers
		int [] arr = {1,2,3,4,5,6};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum / arr.length);
		
	}

}
