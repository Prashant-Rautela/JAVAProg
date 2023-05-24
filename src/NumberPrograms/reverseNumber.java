package NumberPrograms;

public class reverseNumber {

	// Reverse the number
	public int revNum(int num) {
		
		int rev = 0;
		while(num >0) {
			int rem = num%10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		 
		return rev;
		
		
	}
	
	//find the factorial of number
	
	public void findFact(int num) {
		
		
		
		
		
	}
	
	
	// if the square of the number ends with the same number
	//05 : 25; 25: 625; 
	
	public void IsAtmorphic(int num) {
		
		int countDigits_original_num = 0;
		final int original_num = num;
		int square_num = num * num;
		
		while(num>0) {
			
			countDigits_original_num = countDigits_original_num + 1;
			num = num/10;
			
		}
		
		int last_digits_square = (int) (square_num % ( Math.pow(10, countDigits_original_num))); 
		
		
	if(last_digits_square == original_num) {
		System.out.println("I am atmorphic number");
	}
		
	else {
		System.out.println("I am not atmorphic number");
	}
	}
	
	
		
	public static void main(String[] args) {
		
		reverseNumber revnum = new reverseNumber();
		revnum.IsAtmorphic(25);
	}

}
