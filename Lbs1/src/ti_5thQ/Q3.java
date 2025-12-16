package ti_5thQ;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    Remove Duplicate elements from an array
		int[] arr = {1,2,3,1,2};
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				continue;
			}
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					arr[j] = 0;
				}
			}
		}
		
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+" ");
		}
	}

}
