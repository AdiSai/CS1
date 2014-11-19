
/**
 * Write a description of class date here.
 * 
 * @author (Adithya Sairamachandran) 
 * @version (a version number or a date)
 */
public class Date
{
    // instance variables - replace the example below with your own
    private int month;
    private int day;
    private int year;

    /**
     * Constructor for objects of class date
     */
    public Date(int m, int d, int y)
    {
        // initialise instance variables
        month = m;
        day = d;
        year = y;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int toDays()
    {
        // put your code here
        int m = month * 30;
        int y = year * 365;
        int x = (m + day + y);
        return x;
    }
    public int timeBetween(Date other)
    {
        int x = other.toDays();
        int y = this.toDays();
        int z = y - x;
        return z;
    }
    public boolean isLaterThan(Date other)
    {
        if (this.toDays() > other.toDays())
        {
            return true;
        }
        return false;
    }
    public boolean equals (Date other)
    {
        if (this.toDays() == other.toDays())
        {
            return true;
        }
        return false;
    }
    public String toString()
    {
        return month + "-" + day + "-" + year;
    }
    }
