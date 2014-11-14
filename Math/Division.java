
/**
 * Write a description of class Division here.
 * 
 * @author (Adithya S.) 
 * @version (9/11/14)
 */
public class Division
{
  public static void main (String[] args)
  {
        double division = 90;
        double quotient = 0.88;
        double calc01 = division/quotient;
        double calc02 = division%quotient;
        
        String oper = "divided";
        String oper02 = "by";
        String rem = "with a reminder of";
        
        System.out.println("The answer to " + division + " " + oper + " " + oper02 + " " + quotient + ", is " + calc01 + ", " + rem + " " +calc02 + ".");
    }
}
