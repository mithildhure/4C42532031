package ti_5thQ;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	FIND ALL PAIRS OF ELEMENTS IN AN ARRAY WHOSE SUM IS EQUAL TO GIVEN NUMBER.
//		eg number is 7, arr{5,2,3,4,6,1} type;
		
		int[] arr = {1,5,6,3,2,4};
		int n = 7;
		
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = i+1; j < arr.length; j++) {
				sum = arr[i] + arr[j];
				if(sum == n) {
					System.out.println(arr[i] + ","+ arr[j]+" = "+n);
				}
			}
		}
		
	}

}
