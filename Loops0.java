
/**
 * Write a description of class Loops1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Loops0
{
   public static void main (String[] args)
   {
       Scanner scan = new Scanner(System.in);
       System.out.println("What is the statring number?");
       double start = scan.nextDouble();
       System.out.println("What is the ending number?");
       double end = scan.nextDouble();
       System.out.println("Your numbers are " + start + ", " + end + ".");
       for (double i = start; i <= end; i++)
       {
           System.out.println("The next number is " + i + ".");
       }
   }
 }
