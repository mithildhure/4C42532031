package secondQ;

public class Q2 {
	
	public static double squareRoot(double num, double guess) {
		double new_guess = (guess + num/guess)/2;
		if (guess == new_guess) {
			return new_guess;
		}
		return squareRoot(num, new_guess);
	}
	
	public static void main(String[] args) {
//		Calculate the square root of a number;
		
		System.out.println(squareRoot(64, 64/2));
		
	}
	
}
