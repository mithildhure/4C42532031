package ti_fourthQ;

public class Q_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Reverse an array
		
		int[] arr1 = {1,5,2,3,4};
		int start = 0;
		int end = arr1.length - 1;
		
		while(start < end) {
			int temp = arr1[start];
			 arr1[start] = arr1[end];
			arr1[end] = temp;
			
			start++;
			end--;
			
		}
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
