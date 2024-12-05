/*
Display an integer reversed. Write a method with the following header to display an integer in reverse order:
public static void reverse(int number)
For example, `reverse(3456)` displays 6543.
Write a test program that prompts the user to enter an integer then displays its reversal.
 */

// Scanner for user input
import java.util.Scanner;

public class Section_6_4 {
    // Method using number as argument
    public static void reverse(int number) {
        // If number is negative, add hyphen
        if (number < 0) {
            System.out.println("-");
            number = -number;
        }

        // As long as number != 0
        while (number != 0) {
            // Take the last digit of the number and print it
            int lastDigit = number % 10;
            System.out.print(lastDigit);
            // Remove last digit from number
            number /= 10;
        }
        // Breaks out of loop when every digit is done for
        System.out.println();

    }
    public static void main(String[] args) {
        // Creates new scanner instance
        Scanner scanscan = new Scanner(System.in);
        // Prompts user for input
        System.out.print("Enter an integer: ");
        // Saves integer from user input
        int number = scanscan.nextInt();

        // Help text
        System.out.print("Reversed: ");
        // Calling method and using the user input as argument
        reverse(number);

        // Closes data stream
        scanscan.close();
    }
}
