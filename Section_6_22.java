/*
(Math: approximate the square root) There are several techniques for implementing the sqrt method in the Math class. One such technique is known as the Babylonian method. It approximates the square root of a number, n, by repeatedly performing the calculation using the following formula:
nextGuess = (lastGuess + n / lastGuess) / 2
When nextGuess and lastGuess are almost identical, nextGuess is the approximated square root. The initial gues can be any positive value (e.g. 1). This value will be the starting value for lastGuess. If the difference between nextGuess and lastGuess is less than a very small number, such as 0.0001, you can claim that nextGuess is the approximated square root of n. If not, nextGuess becomes lastGuess and the approximation process continues. Implement the following method that returns the square root of n:
public static double sqrt(long n)
Write a test program that prompts the user to enter a psoistive double value and displays it in square root.
 */

import java.util.Scanner;

public class Section_6_22 {
    public static double sqrt(long n) {
        double lastGuess = 1.0;
        double nextGuess = (lastGuess + n / lastGuess) / 2;

        while (Math.abs(nextGuess - lastGuess) > 0.001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }

        return nextGuess;
    }

    public static void main(String[] args) {
        Scanner scanscan = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        long number = scanscan.nextLong();

        if (number < 0) {
            System.out.println("Invalid input. Please enter a positive number.");
        } else {
            System.out.printf("The approximated square root of %d is %.5f%n", number, sqrt(number));
        }

        scanscan.close();
    }
}
