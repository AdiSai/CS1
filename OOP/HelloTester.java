
/**
 * Write a description of class HelloTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class HelloTester
{
   public static void main (String[] args)
   {
       Scanner scan = new Scanner(System.in);
       HelloObjects h = new HelloObjects("Hello");
       h.speak();
       h.morningSpeak();
       h.eveningSpeak();
       System.out.println("\n" + "Enter greeting: ");
       String s1 = scan.nextLine();
       HelloObjects g = new HelloObjects(s1);
       g.speak();
   }
}
