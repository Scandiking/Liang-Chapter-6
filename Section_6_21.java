/*
(Phone keypads) The international standard letter/number mapping for telephones is given in Programming Exercise 4.15. Write a method that returns a number, given an uppercase letter, as follows:
public static int getNumber(char uppercaseLetter)

Write a test program that prompts the user to enter a phone number as a string The input number may contain letters. The program translates a letter (uppercase or lowercase) to a digit and leaves all other characters intact. Here are sample runs of the pgoram:
Enter a string: 1-800-Flowers Enter
1-800-3569377

1800flowers
18003569377
 */

import java.util.Scanner;

public class Section_6_21 {

    // Method to return the corresponding number for a given letter
    public static int getNumber(char uppercaseLetter) {
        uppercaseLetter = Character.toUpperCase(uppercaseLetter); // Convert to uppercase for consistency

        if (uppercaseLetter >= 'A' && uppercaseLetter <= 'C') {
            return 2;
        } else if (uppercaseLetter >= 'D' && uppercaseLetter <= 'F') {
            return 3;
        } else if (uppercaseLetter >= 'G' && uppercaseLetter <= 'I') {
            return 4;
        } else if (uppercaseLetter >= 'J' && uppercaseLetter <= 'L') {
            return 5;
        } else if (uppercaseLetter >= 'M' && uppercaseLetter <= 'O') {
            return 6;
        } else if (uppercaseLetter >= 'P' && uppercaseLetter <= 'S') {
            return 7;
        } else if (uppercaseLetter >= 'T' && uppercaseLetter <= 'V') {
            return 8;
        } else if (uppercaseLetter >= 'W' && uppercaseLetter <= 'Z') {
            return 9;
        } else {
            return -1; // Return -1 if the character is not a valid letter
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a phone number
        System.out.print("Enter a string (phone number): ");
        String input = scanner.nextLine();

        // Translate the input string
        StringBuilder translatedNumber = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                int digit = getNumber(ch); // Convert letter to digit
                translatedNumber.append(digit); // Append the digit to the result
            } else {
                translatedNumber.append(ch); // Append non-letter characters as-is
            }
        }

        // Display the translated phone number
        System.out.println("Translated phone number: " + translatedNumber);

        scanner.close();
    }
}
