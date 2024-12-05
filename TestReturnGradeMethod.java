/*
Same as TestVoidMethod, but redesigned to return a value
(not using void
(in the custom method
(yes, it is used in main)))

 */
public class TestReturnGradeMethod {
    public static void main(String[] args) {
        // Confirmation for the user
        // Calling the method
        System.out.println("The grade is " + getGrade(78.5));
        System.out.println("\nThe grade is " + getGrade(59.5));
    }
    // The method without void
    public static char getGrade(double score) {
        if (score >= 90.0)
            return 'A';
        else if (score >= 80.0)
            return 'B';
        else if (score >= 70.0)
            return 'C';
        else if (score >= 60.0)
            return 'D';
        else
            return 'F';
    }
}
