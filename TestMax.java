public class TestMax {
    public static void main(String[] args) {
        // Assign integers to integer datatype variables
        int i = 5;
        int j = 2;
        // k = max of variables i and j
        // max is not a built-in Java function, it is a custom written one
        // calling the method using its name
        int k = max(i, j);

        // Confirming the output for the user
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }

    // The method that gets called when trying to assign a value to variable k
    public static int max(int num1, int num2) {
        // Instantiate integer variable without a value
        int result;

        // Basic if tests that tests whether the statement num1 is bigger than num 2
        if (num1 > num2)
            // If it is, num1 result is num1 is the biggest number
            result = num1;
            // else (if not), num2 is the biggest number
        else
            result = num2;

        // Return the result to the main method which now has a value and can complete the int k = max(i, j)
        return result;
    }
}