/*
(Sort three numbers) Write a method with the following header to display three numbers in decreasing order:
public static void displaySortedNumbers(double num1, double num2, double num3)

Write a test program that prompts the user to enter three numbers and
invokes the method to display them in decreasing order.
 */

// For user input
import java.util.Scanner;

public class Section_6_5 {
    // Method that is called, using user input as arguments
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        // Initiating temp variable for reordering numbers
        double temp;

        // Basic if tests.
        // if num1 (say 16) < than num2 (say 32)
        if (num1 < num2) {
            // store num1 (16) in temp
            temp = num1;
            // Assign num2 (32) to num1
            num1 = num2;
            // Assign temp (16, originally num1) to num2
            num2 = temp;
        }
        // Check if num1 (32) is less than num3 (64)
        if (num1 < num3) {
            // Store num1 (32) in temp
            temp = num1;
            // Assign num3 (64) to num1
            num1 = num3;
            // Assign temp (32, originally num1) to num3
            num3 = temp;
        }
        // Check if num2 (16) is less than num3 (32)
        if (num2 < num3) {
            // Store num2 (16) in temp
            temp = num2;
            // Assign num3 (32) to num2
            num2 = num3;
            // Assign temp (16, originally num2) to num 3
            num3 = temp;
        }

        // Output for user
        System.out.println("Numbers in decreasing order: " + num1 + ", " + num2 + ", " + num3);
    }

    public static void main(String[] args) {
        // Creating instance of scanner object
        Scanner scanscan = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter three numbers: ");
        // save the input
        double num1 = scanscan.nextDouble();
        double num2 = scanscan.nextDouble();
        double num3 = scanscan.nextDouble();

        // Call the method directly after, using the input variables as arguments
        displaySortedNumbers(num1, num2, num3);

        // Close datastream
        scanscan.close();
    }
}
