package ti_5thQ;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		sort an array containing only 0s 1s and 2s
		
		int[] arr1 = {1,0,2,1,0,2,0,1};
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1.length-1; j++) {
				if(arr1[j] > arr1[j+1]) {
					arr1[j] = arr1[j] + arr1[j+1];
					arr1[j+1] = arr1[j] - arr1[j+1];
					arr1[j] = arr1[j] - arr1[j+1];
				}
			}
		}
		
		for(int k = 0; k <  arr1.length; k++) {
			System.out.print(arr1[k]+" ");
		}
		
	}

}
