package practice;

public class Practice1 {
	
	public static void main(String[] args) {
//  All questions from Day 1 till Day 10 Practice
//	Note: if u saw the answer 2 times repeat full code
				
//  full day 1
//		Check if a number is armstrong or not
//		153 = 1^3 + 5^3 + 3^3
		int num = 153;
		int n = num;
		int cube = 0;
		while(num != 0) {
			int remove = num % 10;
			cube = cube + remove * remove * remove;
			num /= 10;
		}
		
		if(n == cube) {
			System.out.println("Is Armstronf");
		}else{
			System.out.println("Not");
		}
		
	}
	}

