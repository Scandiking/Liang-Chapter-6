/*
(Sum the digits in an integer)
Write a method that computes the sum of the digits in an integer. use the following method header:
public static int sumDigits(long n)
 */

public class Section_6_2 {
    public static int sumDigits(long n) {
        // Set initial value of integer datatype variable sum
        int sum = 0;
        // Make sure n is positive
        n = Math.abs(n);

        // Return the sum as long as n is not 0
        while (n != 0) {
            // Add the last digit to the sum
            sum += n % 10;
            // Remove the last digit
            n /= 10;
        }

        // Return the sum
        return sum;
    }

    public static void main(String[] args) {
        // Test the method by calling it
        System.out.println("The sum of digits in 1234: " + sumDigits(1234));
        System.out.println("The sum of digits in 0001: " + sumDigits(0001));
        System.out.println("The sum of digits in 11: " + sumDigits(11));
    }
}
