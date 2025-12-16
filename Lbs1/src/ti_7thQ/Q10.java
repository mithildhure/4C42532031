package ti_7thQ;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculate the product of all elements in an array;
		
		int[] arr = {2,3,4,5,6,7};
		int product = 1;
		
		for(int i = 0; i < arr.length; i++) {
			product = product * arr[i];
		}
		
		System.out.println(product);
		
	}

}
