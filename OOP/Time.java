
/**
 * Write a description of class Time here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Time
{
    // instance variables - replace the example below with your own
    private int hours;
    private int mins;

    /**
     * Constructor for objects of class Time
     */
    public Time(int h, int m)
    {
        // initialise instance variables
        if (h >= 24 || h < 0 || m >= 60 || m < 0)
        {
            System.err.println("Invalid parameters: setting values to 0");
            hours = 0;
            mins = 0;
        }
        else
        {
            hours = h;
            mins = m;
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    private int toMins()
    {
        // put your code here
        int m = mins;
        int x = hours * 60;
        int y = x + m;
        return y;
    }
    public boolean equals(Time other)
    {
        if (this.hours == other.hours && this.mins == other.mins)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String toString()
    {
        String time = hours + ":" + mins;
        return time;
    }
    public int elapsedSince(Time t)
    {
        int f = this.toMins();
        int g = t.toMins();
        int i = f  - g;
        return i;
    }
}
