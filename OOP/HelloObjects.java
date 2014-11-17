
/**
 * Write a description of class HelloObjects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelloObjects
{
    String greeting;
    int len;
    public HelloObjects(String g)
    {
        greeting = g;
        len = g.length();
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void speak()
    {
       for (int i = len; i > 0; i--)
       {
           System.out.println(greeting);
       }
    }
    public void morningSpeak()
    {
        System.out.println(greeting + ". " + "Good morning world!");
    }
    public void eveningSpeak()
    {
        System.out.println(greeting + ". " + "Good evening World!");
    }
}
