package ti_fourthQ;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Check the equality of two array
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		
		boolean isEqual = true;
		
		if(arr1.length != arr2.length) {
			isEqual = false;
		}else
		{
			for (int i = 0; i < arr1.length; i++) {
				if(arr1[i] != arr2[i]) {
					isEqual = false;
					break;
				}
			}
		}
		
		if(isEqual) {
			System.out.println("Arrays are Equal");
		}else {
			System.out.println("Arrays are not Equal");
		}
		
		
		
	}

}
