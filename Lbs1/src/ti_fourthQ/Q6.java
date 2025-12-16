package ti_fourthQ;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		find the transpose of matrix (row to column, column to row)
//		jaha matrix waha 2d array
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i]);
			}
			System.out.println();
		}
		
		
	}

}
