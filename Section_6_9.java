/*
(Conversions between pounds and kilograms) Write a class that contains the following two methods:
Convert from pounds to kilograms
public static double poundToKilogram(double pound)
Convert from kilograms to pounds
public static double kilogramToPounds(double kilogram)
The formula for conversion is:
pound = 0.453 * kilogram
kilogram = 2.204 * pound

Write a test that invokes these methods to display the following table:
Kilograms       Pounds      |       Pounds      Kilogram
1               2.2         |       20          9.09
3               6.6         |       25          11.36
...
197             433.3       |       510         231.82
199             437.8       |       515         234.09
 */

public class Section_6_9 {
    public static double poundToKilograms(double pound) {
        // Return the value
        return 0.453 * pound;
    }

    public static double kilogramToPounds(double kilogram) {
        // Return the value
        return 2.204 * kilogram;
    }

    public static void main(String[] args) {
        System.out.printf("%-15s%-15s|  %-15s%-15s%n", "Kilograms", "Pounds", "Pounds", "Kilograms");
        System.out.println("------------------------------------------------------------");

        // For loop for each line, starting with kg = 1 and pounds = 20 until kilograms <= 199
        for (int kilograms = 1, pounds = 20; kilograms <= 199; kilograms += 2, pounds += 5) {

            // Calling the kilogramToPounds method for each iteration
            double poundsResult = kilogramToPounds(kilograms);
            // Calling the poundToKilograms method for each iteration
            double kilogramsResult = poundToKilograms(pounds);

            // Print the output
            System.out.printf("%-15d%-15.2f|  %-15d%-15.2f%n", kilograms, poundsResult, pounds, kilogramsResult);
        }
    }
}
