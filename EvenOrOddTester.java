
/**
 * Write a description of class EvenOrOddTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class EvenOrOddTester
{
    public static void main (int[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        int a = 0;
        int b = 1;
        
        System.out.println("Please enter an integer.");
        int orignum = scan.nextInt();
        if (orignum%2 == a)
        {
            System.out.println("The number " + orignum + " is even.");
        }
         else if (orignum%2 == b)
         System.out.println("The number " + orignum + " is odd.");
    }
}
