/**
 * An Assignment based on Think Java 2nd edition, Ex 2-3.
 * The goal is to practice computing with variables in Java.
 *
 * @author Jason Miller
 * @version 1.0
 */

import java.text.DecimalFormat;

public class TimeDemo
{

    public static void runDemo () {
        // Here is an example of how to complete this assignment.
        double price1 = 3.45;
        double price2 = 4.00;
        System.out.print("Initial price: ");
        System.out.println(price1);
        System.out.print("Final price: ");
        System.out.println(price2);
        System.out.print("Price difference: ");
        double difference = price2-price1;
        System.out.println(difference);
        
        // Change these values to reflect the time you started this homework
        int hour1 = 15;  // 24-hour clock
        int minute1 = 47;
        int second1 = 33;

        // Add lines to print your values
        System.out.println("Start time in hr, min, sec:");
        System.out.println(hour1 + ":" + minute1 + ":" + second1);

        // Add lines to calculate and print this value
        System.out.println("Start time in seconds since midnight:");
        double seconds_per_hour = 3600.0;
        double seconds_since_midnight = ((hour1 * seconds_per_hour) + (minute1 * 60) + second1);
        System.out.println(seconds_since_midnight);

        // Add lines to calculate and print this value
        System.out.println("Seconds from start time till midnight:");
        double seconds_to_midnight = (((24.0 - hour1) * seconds_per_hour) - (minute1 * 60) - second1);
        System.out.println(seconds_to_midnight);

        // Add lines to calculate and print this value
        System.out.println("Start time as percentage of the day:");
        DecimalFormat df = new DecimalFormat("#.###");
        double seconds_per_day = 86400.0;
        double percentage_of_day = Double.parseDouble(df.format((seconds_since_midnight / seconds_per_day) * 100.0));
        System.out.println(percentage_of_day);

        // Change these values to reflect the time you finished this homework
        int hour2 = 17;  // 24-hour clock
        int minute2 = 45;
        int second2 = 22;

        // Add lines to calculate and print this value
        System.out.println("Seconds spent on this homework:");
        double seconds_elapsed = ((hour2 - hour1) * seconds_per_hour + ((minute2 - minute1) * 60) + (second2 - second1));
        System.out.println(seconds_elapsed);
    }

    // Do not alter the codes below this line.
    // For now, considering them Java requirements.
    // We will learn how to exploit them later.
    
    private TimeDemo () {    
        // no op
    }

    public static void main () {
        main(null);        
    }

    public static void main (String args[]) {
        runDemo();
    }

}
