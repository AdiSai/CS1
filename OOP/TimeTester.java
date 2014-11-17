
/**
 * Write a description of class TimeTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class TimeTester
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Time illegal1 = new Time(17, 60);
        System.out.println(illegal1);
        Time illegal2 = new Time (24, 16);
        System.out.println(illegal2);
        System.out.println("Please enter the first hour value: ");
        int h1 = scan.nextInt();
        System.out.println("Please enter the first minute value: ");
        int m1 = scan.nextInt();
        Time t1 = new Time(h1, m1);
        System.out.println(t1);
        System.out.println("Please enter the second hour value: ");
        int h2 = scan.nextInt();
        System.out.println("Please enter the second minute value: ");
        int m2 = scan.nextInt();
        Time t2 = new Time(h2, m2);
        if (t1.equals(t2))
        {
            System.out.println("The two times are equal.");
        }
        else
        {
            System.out.println("The two times are NOT equal.");
        }
        int x;
        x = t2.elapsedSince(t1);
        System.out.println(x + " minutes elapsed from "+ t1 + " to " + t2 + ".");
    }
}
