package ti_6thQ;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP to find the sum of all odd numbers in an array;
		
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if((arr[i] % 2 != 0)) {
				sum += arr[i]; 
			}
		}
		System.out.println(sum);
	}

}
