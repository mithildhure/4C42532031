package ti_7thQ;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     WAP to rearrange the arrays in alternating positive and negative items.
//		eg; -7,1, -2, 3, -6, 8, -4
		
		int[] arr = {-3, -1, -2, 4, 6, 7, -5, 9};
		int index = 0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] < 0) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
				index++;
			}
		}
		
		int neg = 1, pos = index;
		while(neg != arr.length && pos != arr.length) {
			if(arr[neg] < 0 && arr[pos] > 0) {
				int temp = arr[neg];
				arr[neg] = arr[pos];
				arr[pos] = temp;
			}
			neg = neg+2;
			pos++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" , ");
		}
	}

}
