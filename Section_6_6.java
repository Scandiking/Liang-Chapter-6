/*
(Display patterns) Write a method to display a pattern as follows:
              1
            1 2
          1 2 3
...
n n-1 ... 3 2 1

The method header is
public static void displayPattern(int n)
 */

public class Section_6_6 {
    public static void main(String[] args) {
        // Test the displayPattern method
        displayPattern(9);
    }

    public static void displayPattern(int n) {
        // Loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop for leading spaces
            // Prints (n-i) spaces before the numbers in current row
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Remove a space to make it a "isosceles" triangle
            }
            // Inner loop for numbers in the current row
            // Print numbers from 1 to the current row number i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();

        }
    }
}
