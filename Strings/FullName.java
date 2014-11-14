
/**
 * Write a description of class FullName here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class FullName
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("What is your first name?");
        String first = scan.next();
        System.out.println("What is your last name?");
        String last = scan.next();
        System.out.println("Your full name is " + first + " " + last + ".");
    }
}
