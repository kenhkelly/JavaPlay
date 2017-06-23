package ForLoopTesting;

import java.util.Scanner;

/**
 * Created by kenneth on 6/23/17.
 */
public class Breaking {

    public static void main(String []args) {

        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an int value: ");
            int i = keyboard.nextInt();
            if (i == 0) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Done!");
        keyboard.close();
    }
}
