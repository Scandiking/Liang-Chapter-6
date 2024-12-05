/*
(Display numbers) Write a method that prints numbers using the following header:
public static void printNumbers(int num1, int num2, int numberPerLine)

This method prints the characters between num1 and num2 with the specified numbers per line.
Write a test program that prints ten character per line from 1 to 100. Numbers are separated by exactly one space.
 */

public class Section_6_12 {
    public static void printNumbers(int num1, int num2, int numberPerLine) {
        // Counter to track numbers printed on the current line
        int count = 0;

        // Loop from num1 to num2
        for (int i = num1; i <= num2; i++) {
            // Print output
            System.out.print(i + " ");
            // Increase current number per line counter
            count++;

            // Advance to next line when count reaches numberPerLine
            if (count % numberPerLine == 0) {
                System.out.println();
            }
        }

        System.out.println();

    }

    // Main method that calls the printNumbers method using 1 as num1, 100 as num2 and 10 as numberPerLine
    public static void main(String[] args) {
        printNumbers(1, 100, 10); // This will give 1, 2, 3, 4, 5,6 ,7, 8, 9, 10 at line 1
        // 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 at line 2 and so on...
    }
}
