/*
(Financial application: compute the future investment value) Write a method that computes future investment value at a given interest rate for a specified number of years. The future investment is determined using the formula in Programming Exercise 2.21. Use the following header:
public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)

For example, `futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.

Write a test program that primpts the user to enter the investment amount (e.g. 1000) and the interest rate (e.g. 9%) and prints a table that displays future value for the years from 1 to 30, as shown below:

The amount invested: 1000
Annual interest rate: 9

Years       Future value
1            1093.80
2            1196.41
...
29          13467.25
30          14730.57
 */

// Scanner for user input
import java.util.Scanner;

public class Section_6_7 {
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        // Calculate future investment value using the given formula
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }

    public static void main(String[] args) {
        // Creating new instance of scanner
        Scanner scanscan = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the investment amount: ");
        double investmentAmount = scanscan.nextDouble();

        // Prompt user for input
        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanscan.nextDouble();

        // Convert annual interest rate to monthly interest rate
        double monthlyInterestRate = annualInterestRate / 100 / 12;

        // Display table header
        System.out.printf("%-10s%20s%n", "Years", "Future Value");
        System.out.println("-----------------------------");

        // Loop through years 1 to 30
        // future value calls the futureInvestmentValue using the user input as arguments
        for (int years = 1; years <= 30; years++) {
            double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
            System.out.printf("%-10s%20s%n", years, String.format("%.2f", futureValue));
        }

        // Closing the datastream
        scanscan.close();
    }
}
