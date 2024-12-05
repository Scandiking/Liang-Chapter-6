/*
(Check password) Some websites impose certain rules for passwords.
Write a method that checks whether a string is a valid password. Suppose the password rules are as follows:
- A password must have at least ten characters
- A password consists of only letters and digits
- A password must contain as least three digits

Write a program that prompts the user to enter a password and displays `Valid Password` if the
rules are followed or `Invalid Password` otherwise.
 */
import java.util.Scanner;

public class Section_6_18 {
    public static boolean isValidPassword(String password) {
        // Checks if password is less than 10 char
        if (password.length() < 10) {
            return false;
        }

        // Check if the password consists of only letters and digits
        // initiates digitCount
        int digitCount = 0;

        //
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false; // returns false if pw contains non-alphanumeric character
            }
            // increase digitCount for each digit it finds
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        // pw must contain at least three digits so if it is less it returns false
        if (digitCount < 3) {
            return false;
        }

        // Otherwise pw is true
        return true;
    }

    public static void main(String[] args) {
        // Create new instance of scanner
        Scanner scanscan = new Scanner(System.in);

        // Prompt the user to enter a password
        System.out.print("Enter your password. ");
        // save string
        String password = scanscan.nextLine();

        // check if password is valid by calling the isValidPassword method and using password as argument
        if (isValidPassword(password)) {
            System.out.println("Your password is valid.");
        } else {
            System.out.println("Your password is invalid.");
        }

        // Close datastream
        scanscan.close();
    }
}
