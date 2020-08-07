package surpriseTest;

import java.util.Scanner;

public class ExamClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInputValue;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number");
		userInputValue = keyboard.nextInt();
		
		ExamClass.testPrimeNumber(userInputValue);
		

	}

}
