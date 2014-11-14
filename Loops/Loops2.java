
/**
 * Write a description of class Loops2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import static java.lang.System.*;
public class Loops2
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        out.println("Enter the first word.");
        String first = scan.next();
        out.println("Enter the second word.");
        String last = scan.next();
        int len1 = first.length();
        int len2 = last.length();
        int diff = len2 - len1;
        out.print(first);
        for (int i = 30 ; diff <= i; i--)
        {
           out.print(".");
        }
        out.print(last);
    }
}
