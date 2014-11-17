
/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Monster
     */
    public Monster(int str)
    {
        // initialise instance variables
        x = str;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void talk()
    {
        // put your code here
        if (x <= 50)
        {
            System.out.println("Roar!!!!!!");
        }
        else
        {
            System.out.println("Roar!!!!!!!!!!!!!!!!!!");
        }
    }
}
