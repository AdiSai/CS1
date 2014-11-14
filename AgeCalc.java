
/**
 * Write a description of class AgeCalc here.
 * 
 * @author (your name) 
 * @version (a version number or a dob)
 */
import java.util.*;
public class AgeCalc
{
    public static void main (String[] args)
    {
      final int daysinayear = 365;
      final int daysinamonth = 30;
      final int currentmonth = 9;
      final int currentday = 25;
      final int currentyear = 2014;
      final int hoursinaday = 24;
      
      Scanner scan = new Scanner (System.in);
      
      System.out.println("Welcome to the Age calculator" + "\n" + "Please input your birth month.");
      int birthmonth = scan.nextInt();
      System.out.println("Please input your birth day.");
      int birthday = scan.nextInt();
      System.out.println("Please input your birth year.");
      int birthyear = scan.nextInt();
      
      int calc1 = (currentyear - birthyear)*daysinayear;
      int calc2 = (currentmonth - birthmonth)*daysinamonth;
      int calc3 = (currentday - birthday);
      
      int daysold = (calc1+calc2+calc3);
      int monthsold = (daysold/30);
      int yearsold = (monthsold/12);
      int hoursold = (daysold*hoursinaday);
      
      System.out.println("You are " + daysold + " days old.");
      System.out.println("You are " + monthsold + " months old.");
      System.out.println("You are " + hoursold + " hours old.");
    }
}
