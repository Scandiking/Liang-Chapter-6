/*
(Number of days in a year) Write a method that returns the number of days in a year using the following header:
public static int numberOfDaysInAYear(int year)
Write a test program that displays the number of days in the years between 2014 and 2034.
 */

public class Section_6_16 {
    public static int numberOfDaysInAYear(int year) {
        // Checks if year % 4 == 0 AND year % 100 !=0 OR year % 400 = 0 if so is leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            // If true return 366
            return 366;
        } else {
            // Otherwise return normal
            return 365;
        }
    }

    public static void main(String[] args) {
        // Print table headers
        System.out.printf("%-10s%-15s%n", "Year", "Days");
        System.out.println("----------------------------");

        // Start for loop with year 2014, go to 2034 with increment of +1
        for (int year = 2014; year <= 2034; year++) {
            // calls numberOfDaysInAYear with year argument to put to days
            int days = numberOfDaysInAYear(year);
            // Prints year and days for each iteration of the loop
            System.out.printf("%-10d%-15d%n", year, days);
        }
    }
}
