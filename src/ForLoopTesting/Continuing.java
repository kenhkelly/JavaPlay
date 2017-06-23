package ForLoopTesting;

import java.util.Scanner;

/**
 * Created by kenneth on 6/23/17.
 */
public class Continuing {

    public static void main(String []args) {

        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an int value: ");
            int i = kb.nextInt();
            if (i > 10) {
                continue;
            }
            if (i == 0) {
                break;
            }

            System.out.println(i);
        }

        System.out.println("Done");
        kb.close();
    }
}
