import java.util.Scanner;
import java.io.*;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numerator, denominator;
		
		try {
		System.out.println("What would you like the numerator to be?");
		numerator = input.nextInt();
		System.out.println("What would you like the denominator to be?");
		denominator = input.nextInt();
		System.out.println(numerator/denominator);
		
		}//end try
		catch(ArithmeticException e) {
			System.out.println("ERROR CAUGHT");
			System.out.println("what do you want to change numerator to?");
			numerator = input.nextInt();
			System.out.println("what do you want to change denominator to?");
			denominator = input.nextInt();
			System.out.println(numerator/denominator);
		}//end catch 
		
		
		input.close();
	}//end main
	
}//end Application
