package ti_6thQ;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		wap to print upper triangular matrix
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i <= j) {
					System.out.print(arr[i][j]+" ");
				}else {
					System.out.print('0'+" ");
				}
			}
			System.out.println();
		}
		
	}

}
