package Account;

import static java.lang.System.out;

/**
 * Created by kenneth on 6/23/17.
 */
public class UseAccount {

    public static void main(String[] args) {

        Account myAccount;
        Account yourAccount;

        myAccount = new Account();
        yourAccount = new Account();

        myAccount.name = "Ken Kelly";
        myAccount.address = "222 Cyberspace Lane";
        myAccount.balance = 6103.22;

        yourAccount.name = "Jane Q. Public";
        yourAccount.address = "111 Consumer Street";
        yourAccount.balance = 55.63;

        myAccount.display();
        out.print(" plus $");
        out.print(myAccount.getInterest(5.00));
        out.println(" interest ");

        out.println();

        yourAccount.display();
        double yourInterestRate = 7.00;
        out.print(" plus $");
        double yourInterestAmount = yourAccount.getInterest(yourInterestRate);
        out.print(yourInterestAmount);
        out.println(" interest ");
    }
}
