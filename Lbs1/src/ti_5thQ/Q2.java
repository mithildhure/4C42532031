package ti_5thQ;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// find the largest sum of elements from the given two array
		
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {6,7,8,9};
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0; i < arr1.length; i++) {
			sum1 += arr1[i];
		}
		
		for(int j = 0; j < arr2.length; j++) {
			sum2 += arr2[j];
		}
		
		if(sum1 > sum2) {
			System.out.println("Sum of Array 1 are the largest");
		}else if(sum2 > sum1){
			System.out.println("Sum of array 2 are the largest");
		}else {
			System.out.println("Both are equal");
		}
		
	}

}
