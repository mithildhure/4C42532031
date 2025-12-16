package ti_5thQ;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ARRAY LEFT ROTATION BY D POSITIONS.

		int[] arr = {2,1,3,4,5};	
		int d = 3; 
		
		for(int i = 0; i < d; i++) {
			int temp = arr[0];
			
			for(int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j+1];
			}
			
			arr[arr.length - 1] = temp;
		}
		
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]);
		}
		
	}
}
