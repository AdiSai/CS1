
/**
 * Write a description of class Box here.
 * 
 * @author (Adithya Sairamachandran) 
 * @version (11/18/14)
 */
public class Box
{
    // instance variables - replace the example below with your own
    private double length;
    private double width;
    private double height;

    /**
     * Constructor for objects of class Box
     */
    public Box(double l, double w, double h)
    {
        // initialise instance variables
        length = l;
        width = w;
        height= h;
    }
    public Box(double x)
    {
        length = x;
        width = x;
        height = x;
    }
    public Box (Box oldBox)
    {
        length = oldBox.length;
        width = oldBox.width;
        height = oldBox.height;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double volume()
    {
        // put your code here
        double x = (length * width * height);
        return x;
    }
    public double area()
    {
        //formula: 2lw + 2lh + 2wh
        double x = 2 * (length * width);
        double y = 2 * (length * height);
        double z = 2 * (width * height);
        double a = (x * y * z);
        return a;
    }
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }
    public Box biggerBox()
    {
        double x = length * (1.25);
        double y = width * (1.25);
        double z = height * (1.25);
        Box newBox = new Box (x, y, z);
        return newBox;
    }
    public Box smallerBox()
    {
        double x = length * (0.25);
        double y = width * (0.25);
        double z = height * (0.25);
        Box newBox =  new Box(x, y, z);
        return newBox;
    }
    public Boolean nests (Box outsideBox)
    {
        if (this.length > outsideBox.length && this.width > outsideBox.length && this.height > outsideBox.height) 
        {
            return true;
        }
        return false;
    }
}
