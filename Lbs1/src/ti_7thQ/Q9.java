package ti_7thQ;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		find the min and max value in a 2D array
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		int min = arr[0][0];
		int max = arr[0][0];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] < min) {
					min = arr[i][j];
				}
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		
		System.out.println("Maximum value : "+max);
		System.out.println("Minimum value : "+min);
	}

}
