package NumberPrograms;

public class FibonaciNumber {

	// 0,1,1,2,3,5,8
	// find top 10 fibo number series
	public static void findFibNum(int n) {

		// find first 10
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1 + ", " + n2 + ", ");

		int n3;

		for (int i = 2; i < n; i++) {

			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(n3 + ", ");

		}
	}

	// find if given number is prime number

	public static void IsPrimeNum(int num) {

		boolean primeFlag = true;

		if (num == 0 || num == 1) {
			System.out.println("Given number is not prime number");
			primeFlag = false;
		}

		else {
			for (int i = 2; i < num / 2; i++) {

				if (num % i == 0) {
					System.out.println("Given number is not prime number");
					primeFlag = false;
				}

			}

		}

		if (primeFlag) {
			System.out.println("Number is prime number");
		}

	}
	
	// number and its reverse is same.
	public static int findReverse(int num) {
		
		//54334 -->
		int n=0;
		
		while(num > 0) {
			
			int rem = num % 10;
			n = n * 10 + rem;
			
			num = num / 10;
			
			
		}
		return n;
		
		
	}
	
	public static int findFactorialNumber(int n) {
		
		int fact = 1;
		for (int i = 1; i <= n ; i++) {
			
			fact = fact * i;
			
			
			
		}
		System.out.print(fact);
		return fact;
		
		
	}
	
	
	
	public static void IsPalindromeNum(int num) {
		
		int reverseNum = findReverse(num);
		if (num == reverseNum) {
			System.out.println("Number is Palindrome number");
		}
		
		else {
			System.out.println("Number is not palindrome number");
		}
		
		
	}
	

	public static void main(String args[]) {

		findFactorialNumber(5);

	}

}
