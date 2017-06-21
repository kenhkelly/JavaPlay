package ForLoopTesting;

import static java.lang.System.out;
import java.util.Scanner;

public class ForLoopTesting {
	
	public static void main (String []args) {
		for (int i = 0, j = 10; i <= j; i++, j--) {
			out.println(i + " " + j);
		}
		
		out.println();
		
		int total = 0;
		for (int i = 0; i < 10; i++) {
			total += i;
		}
		out.println(total);
		
		out.println();
		
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter number to be factoraled (is that a real word? MEh!)");
		int toFactorial = keyboard.nextInt();
		keyboard.close();
		int factorial = 1;
		for (int i = 1; i < toFactorial; ) {
			factorial = factorial * ++i;
		}
		out.println(factorial);
	}
}
