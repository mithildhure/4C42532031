package thridQ;

public class Q2 {

	public static double squareRoot(double num, double guess) {
		
		double new_guess = (guess + num/guess)/2;
		
		if(guess == new_guess) {
			return new_guess;
		}
		return squareRoot(num, new_guess);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		root of quadratic equation
//		-b+Vb^2-4ac/2a and -b-Vb^2-4ac/2a
//		root1 and root2 = 3 types
//		1. >0, 2. == 0 and 3. <0
//		greater than, equal to and less than
		
		double a = 2, b = 3, c = 4, r1 = 0, r2 = 0;
		double disc = b*b-4*a*c;
		
		if(disc > 0) {
			r1 = (-b + squareRoot(disc, disc/2)/(2 * a));
			r2 = (-b - squareRoot(disc, disc/2)/(2 * a));
			
			System.out.println(r1+" "+r2);
		}
		else if(disc == 0) {
			r1 = r2 = -b/(2*a);
			System.out.println(r1+" "+r2);
		}
		else {
			System.out.println("Root are imaginary");
		}
	}

}
