
/**
 * Write a description of class Time here.
 *
 * @author Jamie Kemman
 * @version V1.0
 */
public class Time
{
    // instance variables
    private int hr, min, sec;
    boolean is24hr;

    /**
     * Constructor for objects of class Time
     */
    public Time(int h, int m, int s)
    {
        // initialise instance variables
        this.hr = h;
        this.min = m;
        this.sec = s;
    }
    @Override
    public String toString() {
        
        
        return "Time " + hr + ":" + min + ":" + sec;
    }
    
    public boolean equals(Time that) {
        
        return this.hr == that.hr &&
                this.min == that.min &&
                this.sec == that.sec;
        
    }
}
