
/**
 * Write a description of class Loops8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import static java.lang.System.*;
public class Loops8
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        out.println("Initial number of stars:");
        int numberofstars = scan.nextInt();
        int lineofstars = numberofstars;
        for (int i = 0; i < numberofstars; i++)
        {
            out.print("*");
            while (i >= lineofstars)
            {
                out.println("*");
                lineofstars--;
            }
        }
    }
}
