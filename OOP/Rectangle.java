
/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle
{
    // instance variables - replace the example below with your own
    private int width, height;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(int w, int h)
    {
        // initialise instance variables
        if (w < 0 || h < 0)
        {
            w = 1;
            h = 1;
        }
        else
        {
            width = w;
            height = h;
        }
    }
    public Rectangle(int x)
    {
        if (x < 0)
        {
            width = 1;
            height = 1;
        }
        else
        {
            width = x;
            height = x;
        }
    }
    public Rectangle()
    {
            width = 1;
            height = 1;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String toString()
    {
        // put your code here
        int x = width;
        int y = height;
        return "Width: " + x + " height: " + y + ".";
    }
    public boolean isSquare()
    {
        if (width == height)
        {
            return true;
        }
        return false;
    }
    public boolean equals(Rectangle other)
    {
        if (this.width == other.width && this.height == other.height)
        {
            return true;
        }
        return false;
    }
    public int area()
    {
        int x = width * height;
        return x;
    }
    public int perimeter()
    {
        int x = 2 * (width + height);
        return x;
    }
}
