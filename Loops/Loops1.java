
/**
 * Write a description of class Loops2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import static java.lang.System.*;
public class Loops1
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        out.println("Enter a word.");
        String word = scan.next();
        int times = word.length();
        for (int i = 0; i <= times; i++)
        {
            out.println(word);
        }
    }
}