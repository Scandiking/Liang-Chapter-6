/*
(Math: pentagonal numbers) A pentagonal number is defined as n(3n-1)/2 for n = 1, 2, ..., and so on. Therefore, the first few numbers are 1, 5, 12, 22, ...
Write a method with the following header that returns a pentagonal number:
public static int getPentagonalNumber(int n)
 */

public class Section_6_1 {
    public static int getPentagonalNumber(int n) {
        // use the provided formula
        return n * (3 * n - 1) / 2; // this is the task
    }

    public static void main(String[] args) {
        // Let's test the method 10 times
        for (int i = 1; i <= 10; i++) {
            System.out.println("Pentagonal number " + i + " is: " + getPentagonalNumber(i));
            // Print shows 1, 5, 12, 22 ... like in book
        }
    }
}
