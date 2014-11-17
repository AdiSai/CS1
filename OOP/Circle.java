
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle
{
    // instance variables - replace the example below with your own
    public double radius;;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(double r)
    {
        // initialise instance variables
        radius = r;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double area()
    {
        // put your code here
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public void setRadius(double nr)
    {
        radius = nr;
    }
    public double diameter()
    {
        return radius * 2;
    }
}
