
/**
 * Write a description of class WaitTime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class WaitTime
{
    public static void main (String[] args)
    
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Please input the current hour.");
        int curtime1 = scan.nextInt();
        System.out.println("Please input the current minutee.");
        int curtime2 = scan.nextInt();
        System.out.println("Please input departure hour.");
        int deptime1 = scan.nextInt();
        System.out.println("Please input the departure minute.");
        int deptime2 = scan.nextInt();
        
        int calc01 = (curtime1*60);
        int calc02 = (calc01+curtime2);
        int calc03 = (deptime1*60);
        int calc04 = (calc03+deptime2);
        
        int calc05 = (calc04-calc02);
        int hours = (calc05/60);
        int min = (calc05%60);
        
        System.out.println("The waiting time is " + hours + " hours and " + min + " minutes.");
    }
}
