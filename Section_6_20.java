/*
(Count the letters in a string) Write a method that counts the number of letters in a string using the following header:
public static int countLetters(String s)
Write a test program that primpts the user to enter a string and displays the number of letters in the string.
 */


import java.util.Scanner;

public class Section_6_20 {
    public static int countLetters(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanscan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanscan.nextLine();

        int letterCount = countLetters(input);
        System.out.printf("The number of letters in the string is: %d%n", letterCount);

        scanscan.close();
    }
}
