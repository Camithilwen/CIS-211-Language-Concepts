
/**
 * Write a description of class Time_Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Time_Test
{
    public static void main() {
        
        main(null);
        
    }
    public static void main(String[] args) {
        
        Time time1 = new Time(10, 42, 42);
        
        Time time2 = new Time(10, 42, 42);
        
        Time time3 = new Time(10, 53, 33);
    
        
        System.out.println("Is time1 = to time2? " + time1.equals(time2));
        
        System.out.println("Is time2 = to time3? " + time2.equals(time3));
        
        System.out.printf("time1 is %s, time2 is %s, and time3 is %s.",
                            time1.toString(), time2.toString(), time3.toString());
        
        
    }
}
