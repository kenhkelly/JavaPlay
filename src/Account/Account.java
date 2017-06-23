package Account;

import static java.lang.System.out;

/**
 * Created by kenneth on 6/23/17.
 */
public class Account {
    String name;
    String address;
    double balance;

    public void display() {
        out.print(name);
        out.print(" (");
        out.print(address);
        out.print(" ) has $");
        out.print(balance);
    }

    public double getInterest(double percentageRate) {
        return balance * percentageRate / 100.00;
    }
}
