/**
 * Write a description of class Loops7 here.
 * 
 * Adithya Sairamachandran
 * @version (a version number or a date)
 */
import java.util.*;
import static java.lang.System.*;
public class Loops7
{
    public static void main(String[] args)
    {
        //Scanner scan = new Scanner(System.in);
        int month = 0;
        double loss = 4000d/100d;
        double eff = 100d;
        double x = 4d/100;
        out.println("Month: " + month + "\n" + "Effectiveness: " +eff + "\n");
        for (double i = eff; i >=50; i = i - (i * (4d/100d)))
        {
            //out.println("Effectivness: " + eff);
            month++; //add one to month each time through the loop
            eff = eff - (eff * (4d/100d)); //loss of 4 percent of every month
            out.println("Month: " + month);
            out.println("Effectivness: " + eff + "\n");
        }
        out.println("The drug has expired.");
    }
}