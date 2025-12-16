package ti_6thQ;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP for array right rotation by d position
		int [] arr = {2,3,1,4,5};
		int d = 3;
		
		for(int i = 0; i < d; i++) {
			int temp = arr[arr.length - 1];
			
			for(int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j-1];
			}
			
			arr[0] = temp;
		}
		
		for(int k = 0; k< arr.length; k++) {
			System.out.print(arr[k]);
		}
		
	}

}
