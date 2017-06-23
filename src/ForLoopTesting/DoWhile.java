package ForLoopTesting;

import java.io.File;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by kenneth on 6/23/17.
 */
public class DoWhile {

    public static void main(String[] args) {

        File evidence = new File("cookedBooks.txt");
        try {
            out.println("Looking for " + evidence.getCanonicalPath());
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return;
        }
        Scanner keyboard = new Scanner(System.in);
        char reply;

        do {
            out.print("Delete evidence? (y/n) ");
            reply = keyboard.findWithinHorizon(".", 0).charAt(0);
        } while (reply != 'y' && reply != 'n');

        if (reply == 'y') {
            out.println("Okay, here goes...");
            evidence.delete();
            out.println("The evidence has been deleted.");
        } else {
            out.println("Sorry buddy. Just asking.");
        }

        keyboard.close();

    }
}
