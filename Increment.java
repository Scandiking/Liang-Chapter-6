/*
Used to demonstrate pass-by-value to show that initially x is 1. the "increment" method increments n by 1 and is
2 in the increment method, but after x is still 1 no matter what the method does.
 */

public class Increment {
    public static void main(String[] args) {
        // Initial value of x
        int x = 1;
        // Control print
        System.out.println("Before the call, x is " + x);
        // Calls the increment method using x as argument
        increment(x);
        // Control print (x is still 1)
        System.out.println("After the call, x is " + x);
    }

    public static void increment(int n) {
        // Increment n+1
        n++;
        // Control print
        System.out.println("n inside the method is " + n);
    }
}
