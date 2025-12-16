package ti_6thQ;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		wap to print the smallest element in an array
		
		int [] arr = {4,2,6,7,1,9};
		
		int small = 2;
		
		for(int i = 0; i < arr.length; i++) {
			if(small > arr[i]) {
				small = arr[i];
			}
		}
		System.out.println(small);
		
	}

}
