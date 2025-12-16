package secondQ;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Wap to convert days to years
		int days = 1000;
		int years = days/365;
		int weeks = (days % 365)/7;
		int r_days = (days % 365)%7;
		
		System.out.println(days+" days = "+years+" years "+weeks+" weeks "+r_days+" days");
		
		
	}

}
