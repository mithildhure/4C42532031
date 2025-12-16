package ti_fourthQ;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Concat of an array;
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};
		
		int[] result = new int[arr1.length + arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			result[i] = arr1[i];
		}
		
		for (int j = 0; j < arr2.length; j++) {
			result[arr1.length + j] = arr2[j];
		}
		
		for (int k = 0; k < result.length; k++) {
			System.out.print(result[k]+" ");
		}
		
	}

}
