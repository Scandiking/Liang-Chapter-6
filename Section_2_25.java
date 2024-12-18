/*
(Convert milliseconds to hours, minutes, and seconds) Write a method that converts milliseconds to
hours, minutes, and seconds using the following header:
public static String convertMillis(long millis)
The method returns a string as hours:minutes:seconds. For example, convertMillis(5500) returns a string 0:0:5,
convertMillis(100000) returns a string 0:1:40, and convertMillis(555550000) returns a string 154:19:10.
Write a test program that primpts the user to enter a long integer for milliseconds and displays a string in the
format of hours:minutes:seconds.
 */
import java.util.Scanner;

public class Section_2_25 {
    public static String convertMillis(long millis) {
        long totalSeconds = millis/1000;
        long hours = totalSeconds/3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;

        return hours + ":" + minutes + ":" + seconds;
    }

    public static void main(String[] args) {
        Scanner scanscan = new Scanner(System.in);
        System.out.print("Enter milliseconds: ");
        long millis = scanscan.nextLong();

        String result = convertMillis(millis);
        System.out.println("Converted time: " + result);

        scanscan.close();
    }
}
