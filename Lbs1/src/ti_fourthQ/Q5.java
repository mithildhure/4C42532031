package ti_fourthQ;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		sum of 2 matrices
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+arr1[i][j]+" ");
			}
			System.out.println();
		}
		
	}	

}
