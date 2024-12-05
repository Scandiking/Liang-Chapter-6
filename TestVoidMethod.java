public class TestVoidMethod {
    public static void main(String[] args) {

        System.out.print("The grade is ");
        // Calling the method "printGrade"
        printGrade(78.5);

        System.out.print("The grade is ");
        // Calling the method "printGrade"
        printGrade(59.5);
    }

    // The method printGrade
    // It is void because we specify the argument in the main method, thus it does not need to return a value because
    // we will provide if
    public static void printGrade(double score) {
        // Then ensues the if tests to check what score
        if (score >= 90.0) {
            System.out.println("A");
        }
        else if (score >= 80.0) {
            System.out.println("B");
        }
        else if (score >= 70.0) {
            System.out.println("C");
        }
        else if (score >= 60.0) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}
