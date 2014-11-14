
/**
 * Write a description of class InputStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class InputStuff
{
     public static void main (String[] args)
    {
       String Hello = "Welcome to the program. Today, you will be filling out a survey.";
       String begin = "Please enter your name.";
       
       Scanner scan = new Scanner( System.in );
       String a, b, c, d, e, f ;
       
       System.out.println(Hello + "\n" + begin);
       a = scan.nextLine();
    }
}
