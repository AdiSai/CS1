
/**
 * Write a description of class Excercise11 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Excercise11
{
    public static void main (String[] args)
    {
      Scanner scan = new Scanner (System.in);
        
        System.out.println("Please input the right front tire pressure.");
        int rfront = scan.nextInt();
        System.out.println("Please input the left front tire pressure.");
        int lfront = scan.nextInt();
        System.out.println("Please input the right rear tire pressure.");
        int rrear = scan.nextInt();
        System.out.println("Please input the left rear tire pressure.");
        int lrear = scan.nextInt();
        
        if (rfront == lfront && rrear == lrear)
         {
             System.out.println("Inflation is ok.");
          }
         else
         {
             System.out.println("Inflation is bad.");
         }
    }
}
