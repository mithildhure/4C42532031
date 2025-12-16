package ti_6thQ;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP to sort an array according to the order defined by another array
		int[] arr = {2,3,1,4,5};
		
		int[] arr2 = {1,2,3,4,5};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr[i] != arr[j]) {
					arr[j] = arr[i];
				}
			}
		}
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		
	}

}
