package ti_5thQ;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Search an element in an matrix
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		int search = 8;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
				if(search == arr[i][j]) {
					System.out.print(arr[i][j]);
				}
			}
		}
		
	}

}
