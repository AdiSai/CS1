
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car
{
    // instance variables - replace the example below with your own
    private double odometerstart;
    private double odometerend;
    private double gasused;

    /**
     * Constructor for objects of class Car
     */
    public Car(double a, double b, double c)
    {
        // initialise instance variables
        odometerstart = a;
        odometerend = b;
        gasused = c;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double mpg()
    {
        // put your code here
        double y = odometerend - odometerstart;
        double x = y / gasused;
        return x;
    }
    public void fillUp(double newstart2, double endmiles2, double mpg2)
    {
        // put your code here
        odometerstart = newstart2;
        odometerend = endmiles2;
        gasused = mpg2;
    }
    public boolean gasHog()
    {
         if (mpg() <= 15)
         {
             return true;
         }
         else
         {
             return false;
         }
    }
    public boolean ecoCar()
    {
         if (mpg() >= 30)
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
        String s = "The Miles per gallon is: ";
        return s;
    }
}
