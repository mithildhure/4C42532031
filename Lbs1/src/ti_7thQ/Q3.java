package ti_7thQ;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP to convert a two dimensional array into 1D array
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[] arr1 = new int[arr[0].length + arr[1].length+ arr[2].length];
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr1[index++] = arr[i][j];      //works the same      		
//				index++;   // works the same
			}
		}
		
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
	}

}
