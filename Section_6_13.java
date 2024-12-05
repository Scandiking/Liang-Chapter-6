/*

(Sun series) Write a method to compute the following series:

m(i) = (1/3) + (2/4) + ... + (i / i+2)

Write a test that displays the following table:
I           m(i)
----------------
1           0.33333
2           0.83333
...
19          14.7093
20          15.6184


 */

public class Section_6_13 {

    public static double computeSeries(int i) {
        // Initiates sum
        double sum = 0.0;

        // Iterates from k = 1 to k = i
        for (int k = 1; k <= i; k++) {
            // Calculates the value of the current term
            // Adds the value of the current term (k/k+2) to the cumulative sum
            sum += (double) k / (k + 2);
        }

        // And returns this to use for the print
        return sum;

    }

    public static void main(String[] args) {
        // Printing table header
        System.out.printf("%-10s%-10s%n", "i", "m(i)");
        System.out.println("------------------------");

        // Loop for 20 times
        for (int i = 1; i <= 20; i++) {
            // Saves value to result by calling the computeSeries method and using i as argument
            double result = computeSeries(i);
            System.out.printf("%-10d%-10.5f%n", i, result);
        }


    }
}
