package ti_6thQ;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      WAP to divide 1 array into 2 array
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		int[] a1 = new int[arr.length / 2];
		int[] a2 = new int[arr.length - a1.length];
		
		for(int i = 0; i < a1.length; i++) {
			a1[i] = arr[i];
		}
		
		for(int j = 0; j < a2.length; j ++) {
			a2[j] = arr[a1.length+j];
		}
		
		
	}

}
