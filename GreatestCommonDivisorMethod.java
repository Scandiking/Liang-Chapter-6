import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        Scanner scanscan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = scanscan.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = scanscan.nextInt();

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));
    }

    public static int gcd(int n1, int n2) {
        int gcd = 1;
        int k = 2;

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }

        return gcd;
    }
}
