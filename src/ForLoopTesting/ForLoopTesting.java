package ForLoopTesting;

import static java.lang.System.out;
import java.util.Scanner;

public class ForLoopTesting {
	
	public static void main (String []args) {
		// Loop to meet in the middle of 0 and 10
		for (int i = 0, j = 10; i <= j; i++, j--) {
			out.println(i + " " + j);
		}
		
		out.println();
		
		// Loop to add the sum of each i
		int total = 0;
		for (int i = 0; i < 10; i++) {
			total += i;
		}
		out.println(total);
		
		out.println();
		
		// Factorial of X, e.g 3! = 6
		int toFactorial = 0;
//		Scanner keyboard = new Scanner(System.in);
		out.print("Enter number to be factoraled (is that a real word? MEh!): 3");
//		toFactorial = keyboard.nextInt();
		toFactorial = 3;
		out.println();
//		keyboard.close();
		
		int factorial = 1;
		for (int i = 1; i < toFactorial; ) {
			factorial = factorial * ++i;
		}
		out.println(factorial);
		
		out.println();
		
		// Three copies of * to *****
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k <= j; k++) {
					out.print("*");
				}
				out.println();
			}
		}
	}
}
