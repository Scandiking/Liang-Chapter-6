/*
Display current date and time
Listing 2.7, ShowCurrentTime.java, displays the current time.
Revise this exampple to display the current date and time.
The calendar example in Listing 6.12, PrintCalendar.java, should give you some ideas on how to
find the year, month and the day.
 */


import java.util.Calendar;

public class Section_2_24 {

    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();

        // Create a calendar instance
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);

        // Extract year, month, day, hour, minute and second
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.printf("Current date and time: %d-%02d-%02d %02d:%02d:%02d", year, month, day, hour, minute, second);
    }
}
