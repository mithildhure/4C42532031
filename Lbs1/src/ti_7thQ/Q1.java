package ti_7thQ;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP to move all the negative elements to one side of the array;
		
		int[] arr = {2, 4, -1, 7, -3, 9, -6};
		
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
				if(arr[i] < 0) {
					int temp = arr[index];
					arr[index] = arr[i];
					arr[i] = temp;
					index++;
				}
		}
		
		for(int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
