/*
Financial application: compute commissions
Write a method that computes the commission, using the scheme in Programming Exercise 5.39. The header of the method is as follows:
public static double computeCommission(double salesAmount)
Write a test program that displays the following table:
Sales Amount        |           Commission
10000               |           900.0
15000               |           1500.0
...                 |           ...
95000               |           11100.0
100000              |           11700.0
 */

public class Section_6_11 {
    public static double computeCommission(double salesAmount) {
        // Initiates commission variable
        double commission = 0.0;

        // The values are calculated with a simple if/else test
        if (salesAmount <= 5000) {
            commission = salesAmount * 0.08;
        } else if (salesAmount <= 10000) {
            commission = 5000 * 0.08 + (salesAmount - 5000) * 0.10;
        } else {
            commission = 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12;
        }

        // and then returns the result
        return commission;

    }

    public static void main(String[] args) {
        // Printing table header
        System.out.printf("%-20s|%20s%n", "Sales Amount", "Commission");
        System.out.println("-----------------------------------------");

        // Initiates salesAmount at 1000 and runs loop until sales amount reaches 100000 and "jumps" 5k each iteration
        for (double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
            // Calls for computeCommission method and using salesAmount as argumetn
            double commission = computeCommission(salesAmount);
            System.out.printf("%-20.0f|%20.2f%n", salesAmount, commission);
        }
    }
}
