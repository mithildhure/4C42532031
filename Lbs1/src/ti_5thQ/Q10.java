package ti_5thQ;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// sort first half of an array in ascending and second half in descending
		
		int[] arr = {2,1,3,4,7,5,6,8};
		
		int[] arr1 = new int[arr.length / 2];
		int[] arr2 = new int[arr.length / 2];
		
		for(int i = 0; i < arr.length / 2; i++) {
			arr1[i] = arr[i];
		}
		
		
//		To check
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		
	}

}
