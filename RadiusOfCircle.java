
/**
 * Write a description of class RadiusOfCircle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class RadiusOfCircle
{
   public static void main (String[] args)
   {
       Scanner scan = new Scanner(System.in);
       System.out.println("What is the area, of your circle?");
       double area = scan.nextDouble();
       double icalc = area/Math.PI;
       double radius = Math.sqrt(icalc);
       System.out.println("The radius of your circle, with an area of " + area + " is " + radius);
   }
}
