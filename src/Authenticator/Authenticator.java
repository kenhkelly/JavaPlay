package Authenticator;

import javax.swing.*;

/**
 * Created by kenhkelly on 6/26/17.
 */
public class Authenticator {

    public static void main(String[] args) {

        String username = JOptionPane.showInputDialog("Username:");
        String password = JOptionPane.showInputDialog("Password:");

        if (
                (username != null && password != null) &&
                (username.toLowerCase().equals("kkelly") && password.equals("Test123"))
        )
        {
            JOptionPane.showMessageDialog(null, "You're in!");
        }
        else {
            JOptionPane.showMessageDialog(null, "You're suspicious...");
        }
    }
}
