
/**
 * Write a description of class Excercise7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Excercise7
{
   public static void main (String[] args)
   {
       Scanner scan = new Scanner (System.in);
     
       System.out.println("What is the air tempreature?");
       double tAir = scan.nextDouble();
       System.out.println("What is the steam tempreature?");
       double tSteam = scan.nextDouble();
       
       double maxeff = (1 - (tAir / tSteam));
       
       if (tSteam >= 373)
       {
           System.out.println("The maximum effiency is " + maxeff + ".");
       }
       else 
       {
           System.out.println("There is no steam, so there is 0 effiency.");
       }
}
}
