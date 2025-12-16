package ti_5thQ;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Median of 2 sorted arrays of an equal size;
		int[] arr1 = {1,2,5,3};
		int[] arr2 = {6,7,4,8};
		int[] arr3 = new int[arr1.length + arr2.length];
		
		for(int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		
		for(int j = 0; j < arr2.length; j++) {
			arr3[arr1.length + j] = arr2[j];
		}
//		now bubble sort if not sorted
		for(int i = 0; i < arr3.length; i++) {
			for(int j = 0; j < arr3.length - 1; j++) {
				if(arr3[j] > arr3[j+1]) {
					arr3[j] = arr3[j] + arr3[j+1];
					arr3[j+1] = arr3[j] - arr3[j+1];
					arr3[j] = arr3[j] - arr3[j+1];
				}
			}
		}
		
//		median
		int mid = arr3.length / 2;
		System.out.println((arr3[mid-1]+arr3[mid])/2);
		
	}

}
