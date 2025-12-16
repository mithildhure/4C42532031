package ti_6thQ;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Wap to find the largest element in an array
		
		int [] arr = {4,3,6,9,2,7};
		int large = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(large < arr[i]) {
				large = arr[i];
			}
		}
		
		System.out.println(large);
	}

}
