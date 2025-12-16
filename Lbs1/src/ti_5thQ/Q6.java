package ti_5thQ;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Find repeating elements in an array
		int[] arr = {1,2,3,1,4,5,2,3,4,5,5};
		
		for(int i = 0; i < arr.length; i++) {
			int count = 1;
			if(arr[i] == 0) {
				continue;
			}
			
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
					arr[j] = 0;
				}
			}
			
			if(count > 1) {
				System.out.println(arr[i]+" Repated "+count+" times");
			}
		}
		
		
	}

}
