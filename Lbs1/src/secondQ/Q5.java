package secondQ;

public class Q5 {
	
	public static void main(String[] args) {
		
//		Replace all 0 and 1 within integer;
		int num = 60200;
		int result = 0;
		while(num != 0) {
			int rem = num % 10;
			if (rem == 0) {
				rem = 1;
			}
			result = result * 10 + rem;
			num /= 10; 
		}
		
		while(result != 0) {
			int rem = result % 10;
			num = num * 10 + rem;
			result /= 10;
		}
		System.out.println(num);
		
		
	}
}
