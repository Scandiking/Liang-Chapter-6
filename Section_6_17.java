/*
Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using the following header: Here is a sample run:
public static int printMatrix(int year)
that primpts the user to enter n and siaplys an n-by-n matrix. Here is a sample run:
Enter n: 3
0 1 0
0 0 0
1 1 1

 */

// Scanner for user input
import java.util.Scanner;

public class Section_6_17 {

    public static void printMatrix(int n) {
        // Starts i at n and stops loop at n, incrementing i+1
        // This controls the rows of the matrix
        for (int i = 0; i < n; i++) {
            // The inner loop controls the columns of the matrix
            // j starts at 0 and runs as long as j < n
            // j++ incemented by 1 to move to next column
            for (int j = 0; j < n; j++) {
                // Print random 0s and 1s followed by space
                System.out.print((int) (Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create new scanner instance
        Scanner scanscan = new Scanner(System.in);


        // Prompts user for input
        System.out.println("Enter n: ");
        // saves user input
        int n = scanscan.nextInt();
        // Calls the method using n as argument
        printMatrix(n);
        // Closes datastream
        scanscan.close();
    }
}
