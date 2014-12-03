
/**
 * Write a description of class Weight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weight
{
    // instance variables - replace the example below with your own
    int data[];

    /**
     * Constructor for objects of class Weight
     */
    public Weight(int[] init)
    {
        // initialise instance variables
        data = new int [(init.length)];
        for (int i = 0; i < data.length; i++)
        {
            data[i] = init[i];
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void print()
    {
        for (int j = 0; j < data.length; j++)
        {
            System.out.println("The " + j +"th therm is: " + data[j] +".");
        }
    }
    public int average()
    {
        int x = 0;
        int y = ((data.length) - 1);
        for (int j = y; j > 0; j--)
        {
            x = data[j] + x;
        }
        int average = x/y;
        return average;
    }
}
