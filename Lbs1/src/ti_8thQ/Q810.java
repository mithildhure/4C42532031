package ti_8thQ;

public class Q810 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Print all the permuations of a string
		
		String s = "abc";
		
		char[] arr = s.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				char temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				System.out.println(arr);
			}
		}
		
	}

}
