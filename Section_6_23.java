/*
(Occurences of a specified character)
Write a method that finds the number of occurrences of a specified character in a string using the following header:
public static int count(String str, char a)
For example, count("Welcome", "e") returns 2.
Write a test program that prompts the user to enter a string followed by a character then displays the number of
occurences of the character in the string.
 */

import java.util.Scanner;

public class Section_6_23 {
    public static int count(String str, char a) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanscan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanscan.nextLine();

        System.out.print("Enter a character to count: ");
        char inputChar = scanscan.next().charAt(0);

        int occurences = count(inputString, inputChar);
        System.out.printf("The character '%c' appears %d time(s) in the string \"%s\".%n", inputChar, occurences, inputString);

        scanscan.close();
    }
}
