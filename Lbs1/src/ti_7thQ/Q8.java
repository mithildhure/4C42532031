package ti_7thQ;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Move all the zeroes at the end of the array
	
		int[] arr = {1,0,2,0,0,4,6,9};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j+1] > arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
