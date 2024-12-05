/*
(Estimate pi) Pi can be computed using the following summation:
m(i) = 4 (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 ... + ( (-1)^i+1 / 2i-1))

Write a method that reutns m(i) for a given `i` and write a test program that displays the following table:
i           m(i)
1           4.0000
101         3.1515
201         3.1466
301         3.1449
401         3.1441
...
801         3.1428
901         3.1427
 */

public class Section_6_14 {
    // Compute pi
    public static double computePi(int i) {

        // Set initial sum
        double sum = 0.0;

        // This loop calculates the summation part of the series for PI
        // k is the llop variable. represents current term being computed
        for (int k = 1; k <= i; k++) {
            // Math.pow(-1, k +1) alternates the sign of each term which is +, -, +, - each other time
            // 2 * k - 1 calculates the denominator
            // sum+= adds each computed term to the cumulative sum
            sum += Math.pow(-1, k + 1) / (2 * k - 1);
        }

        // Multiply sum by 4 as an approximation of PI/4 because PI = 4 * (1 - 1/3 + 1/5 - 1/7 + ...)
        return 4 * sum;
    }

    public static void main(String[] args) {
        // Printing table header
        System.out.printf("%-10s%-10s%n", "i", "m(i)");
        System.out.println("------------------------");

        // Start for loop at 1 and continue to <= 901 and jump +100 each i(teration)
        for (int i = 1; i <= 901; i += 100) {
            // each iteration, call the computePi method and use i as argument
            double piEstimate = computePi(i);
            System.out.printf("%-10d%-10.4f%n", i, piEstimate);
        }
    }
}
