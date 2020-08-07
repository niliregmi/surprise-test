package surpriseTest;



public class ExamClass {
	
	public static void testPrimeNumber(int num) {
		boolean isNumberPrime = true;
		
		for ( int i = 2; i < num; i++) {
			if (num % i ==0) {
				isNumberPrime = false;
				
				break;
			}
			
			
		}
		 if (isNumberPrime) {
			 System.out.println("Prime Number");
		 }
		 else {
			 System.out.println("Not Prime Number");
		 }
		
	}
		
		
}
		
	




