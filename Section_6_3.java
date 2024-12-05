/*
Palindrome integer
Write the methods with the following headers:
// Return the reversal of an integer, e.g., reverse (456) returns 654
public static int reverse(int number)
// Return true if number is a palindrome
public static boolean isPalindrome(int number)
Use the `reverse` method to implement `isPalindrome`. A number is a palindrome if its reversal is the same as itself.
Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.
 */
import java.util.Scanner;

public class Section_6_3 {
    // Reverse the integer given
    public static int reverse(int number) {
        // Initial value
        int reversed = 0;

        // While loop. As long as number !=0 iterates trough each digit of number
        while (number !=0) {
            // Takes last digit of number using mod
            int lastDigit = number % 10;
            // Multiplies current value of reverse by 10 to shift digit to the left
            reversed = reversed * 10 + lastDigit;
            // Removes the last digit and discard fractional part (if any)
            number /= 10;
        }

        // Out of the loop, returns the reversed integer
        return reversed;
    }

    // Checks whether number is the same in reverse (111, 121)
    // If it does not return, it can not be true, then goes to else
    public static boolean isPalindrome(int number) {
        // Checks whether it is the same by calling the reverse method and using the number as argument
        return number == reverse(number);
    }

    public static void main(String[] args) {
        // Creates new instance of scanner object
        Scanner scanscan = new Scanner(System.in);

        // Prompts user for input
        System.out.println("Enter an integer: ");
        // Saves input as integer
        int number = scanscan.nextInt();

        // Does basic if/else test by calling the isPalindrome method using given integer number as argument
        if (isPalindrome(number)) {
            // Validates claim for user
            System.out.println(number + " is a palindrome.");
        } else {
            // Validates claim for user
            System.out.println(number + " is not a palindrome.");
        }

        // Closes datastream
        scanscan.close();
    }
}
