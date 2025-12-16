package ti_fourthQ;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Second largest number in an array
		
		int[] arr = {2,4,1,3,5};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
				}
			}
		}
		
		System.out.println(arr.length-1);
		
	}

}
