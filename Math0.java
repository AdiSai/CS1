
/**
 * Write a description of class Math0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Math0
{
   public static void main (String[] args)
   {
       Scanner first = new Scanner (System.in);
      
       String st = "Welcome to the program.";
       String st2 = "Please input your first number.";
       String st3 = "Please input your second number.";
       System.out.println(st + "\n" + st2);
       double a = first.nextInt();
       System.out.println(st3);
       double b = first.nextInt();
       double c = a+b;
       double result = Math.sqrt(c);
       double result02 = Math.pow(b, a);
     
       System.out.println("The result to the square root of " + a + " plus " + b + " is " + result + ". " + "The result to the base " + b + " raised to " + a + " power " + "is " + result02+ ".");
     
   }
}