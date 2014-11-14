
/**
 * Write a description of class Loops3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import static java.lang.System.*;
public class Loops3
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        out.println("How many integers will be added?");
        int count = scan.nextInt();
        int nextnum = 0;
        int total = 0;
        for (int i = 0; i < count; i++)
        {
            out.println("Please input the next integer");
            nextnum = scan.nextInt();
            total = nextnum + total;
            //out.println(total);
        }
        out.println("The total is " + total);
    }
}
