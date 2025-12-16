package ti_fourthQ;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    Sort an array in ascending order
//		USing bubble sort
		
		int[] arr1 = {3,4,1,2,5};
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length-1; j++) {
				if (arr1[j] > arr1[j+1]) {
					arr1[j] = arr1[j] + arr1[j+1];
					arr1[j+1] = arr1[j] - arr1[j+1];
					arr1[j] = arr1[j] - arr1[j+1];
				}
			}
		}
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		
	}

}
