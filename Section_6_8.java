/*

(Conversions between mile and a kilometer) Write a class that contains the following two methods:
- Convert from Mile to Kilometer
public static double mileToKilometer(double mile)
- Convert from Kilometer to Mile
public static double kilometerToMile(double kilometer)
The formula for the conversion is:
1 mile = 1.6 kilometers
Write a test program that invokes these methods to display the following tables:
Miles   Kilometer   |   Kilometer   Miles
1       1.609       |   20          12.430
2       3.218       |   25          15.538
...     ...         |   ...         ...
9       14.481      |   60          37.290
10      16.090      |   65          40.398

*/

public class Section_6_8 {
    // Method to convert miles to kilometers
    public static double mileToKilometer(double mile) {
        return mile * 1.6;
    }

    // Method to convert kilometers to miles
    public static double kilometerToMile(double kilometer) {
        return kilometer / 1.6;
    }

    public static void main(String[] args) {
        // Display the table header
        System.out.printf("%-10s%-15s|  %-15s%-10s%n", "Miles", "Kilometers", "Kilometers", "Miles");
        System.out.println("---------------------------------------------------------");


        // Loop to generate the table
        // initializes int miles = 1 and kilometers = 20
        // loop continues until miles <= 10
        // miles++ increases +1 for each loop (1, 2, 3) while km+= +5 (20, 25, 30)
        for (int miles = 1, kilometers = 20; miles <= 10; miles++, kilometers+= 5) {

            // Compute corresponding kilometer for miles
            double kilometerResult = mileToKilometer(miles);

            // Compute corresponding mile for kilometers
            double mileResult = kilometerToMile(kilometers);

            // Display the values in tabular format
            System.out.printf("%-10d%-15.3f|  %-15d%-10.2f%n", miles, kilometerResult, kilometers, mileResult);
        }
    }
}
