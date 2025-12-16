package ti_7thQ;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP to find the nearest smaller number on the left side in an array
		
		int[] arr = {6,3,5,4,9,1};
		int smallest = arr[0];
		for(int i = 0; i<arr.length/2; i++) {
			if(smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		
		
		System.out.println(smallest);
		
	}

}
