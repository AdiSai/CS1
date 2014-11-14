
/**
 * Write a description of class Loops6Redo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import static java.lang.System.*;
public class Loops6
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        out.println("Enter the monthly payment.");
        int monthlypayment = scan.nextInt();
        int month = 0;
        double remainder = 0;
        double balance = 1000d;
        double intrestrate = 1.5d/100d;
        double totalpayments = 0;
        for (double i = balance; i >= 0; i = i - (i * (intrestrate)))
        {
            month++; //add one to month each time through the loop
            //balance = ((balance/intrestrate));
            balance = balance + ((balance * intrestrate) - monthlypayment);
            totalpayments = totalpayments + monthlypayment;
            out.println("Month: " + month);
            out.println("Balance: " + balance);
            out.println("Total payments: " + totalpayments + "\n");
            if (balance <=0)
            {
               break;
            }
        }
    }
}