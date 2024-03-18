
/**
 * Example 3-3 from the Think Java textbook.
 *
 * Jamie Kemman
 * version 1.1 - 1/18/2023
 */
//import scanner utility
import java.util.Scanner;

public class Ex_3_3
{
    public static void main(String[] args) {
        //create new scanner
        Scanner input = new Scanner(System.in);
        
        //variable declaration
        int seconds_per_hour = 3600;
        int seconds_per_minute = 60;
    
        //gather user input
        System.out.println("Input total number of seconds: ");
        int total_seconds = input.nextInt();
        
        //convert total seconds into hours, minutes, seconds
        int hours = total_seconds / seconds_per_hour;
        int minutes = (total_seconds / seconds_per_minute) % seconds_per_minute;
        int seconds = total_seconds % seconds_per_minute;
        
        //print result
        System.out.printf("\n %d seconds = %d hours, %d minutes,and %d seconds.",
        total_seconds, hours, minutes, seconds);
    }
}