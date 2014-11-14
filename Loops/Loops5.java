
/**
 * Write a description of class Loops5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import static java.lang.System.*;
public class Loops5
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        out.println("Please enter x.");
        double x = scan.nextDouble();
        out.println("Please enter n.");
        double n = scan.nextDouble();
        double answer = 1;
        double square = 0;
        int i = 0;
        //for (double i  = 1; i<n; i++)
        //{
            //square = x * x;
            //answer = square + answer;
        //}
        while (i < n)
        {
            answer = x * answer;
            i++;
        }
        out.println("The answer is " + answer + ".");
    }
}
