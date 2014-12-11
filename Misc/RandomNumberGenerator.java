
/**
 * Write a description of class RandomNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class RandomNumberGenerator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Max Value: ");
        int MAX_VALUE = (int)scan.nextDouble();
        if (MAX_VALUE < 100)
        {
            MAX_VALUE = 100;
        }
        else if (MAX_VALUE > Integer.MAX_VALUE)
        {
            MAX_VALUE = Integer.MAX_VALUE;
        }
        int x = (int)(Math.random()*MAX_VALUE+1);
        int count = 0;
        if (x > 0 && x < 101)
        {
            count++;
            System.out.println("At Count: " + count + ", Random Number: " + x);
        }
        else
        {
            for (int i = 0; i < Integer.MAX_VALUE; i++)
            {
                count++;
                x = (int)(Math.random()*MAX_VALUE+1);
                System.out.println("At Count: " + count + ", Random Number: " + x);
                if (x > 0 && x < 101)
                {
                    if (count > 2)
                    {
                        System.out.println("\n" + "At Count: " + count + ", Random Number: " + x);
                        break;
                    }
                    else
                    {
                         System.out.println("At Count: " + count + ", Random Number: " + x);
                         break;
                    }
                }
            }
        }
     }
}
