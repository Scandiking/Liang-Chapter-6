/*
(use the `isPrime` method)
Listing 6.7, PrimeNumberMethod.java, provides the `isPrime(int number)` method for testing
whether a number is p rime. use this method to find the number of prime numbers less than 10000.
 */

public class Section_6_10 {
    public static void main(String[] args) {
        // Set initial count value
        int primeCount = 0;
        // For loop to check statement
        for (int number = 2; number < 10000; number++) {
            // If method isPrime(number) is corrent
            if (isPrime(number)) {
                // then increase primeCount number variable
                primeCount++;
            }
        }

        // Tell user what the program found
        System.out.println("The number of prime numbers less than 10.000 is: " + primeCount);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // 0 and 1 can not be prime numbers
        if (number <= 1) return false;
        // 2 is the smalles possible divisor for any number except 1
        // The loop runs as long as divisor (2) is <= to Math.sqrt(number)
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            // If a divisor is found the number is not a prime
            if (number % divisor == 0) {
                return false;
            }
        }
        // Otherwise, if no divisor are found by the time divisor exceeds Math.sqrt(number) it is a prime number
        return true;
    }
}
