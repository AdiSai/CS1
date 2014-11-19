
/**
 * Write a description of class DateTester here.
 * 
 * Adithya Sairamachandran
 * @version (a version number or a date)
 */
public class DateTester
{
    public static void main(String[] args)
    {
       Date d1 = new Date(10, 7, 2014);
       Date d2 = new Date(10, 6, 2014);
       System.out.println("Date 1 in days: " + d1.toDays());
       System.out.println("Date 2 in days: " + d2.toDays());
       System.out.println("isLaterThan: " + d1.isLaterThan(d2));
       System.out.println("equals: " + d1.equals(d2));
       System.out.println("toString: " + d1.toString());
       System.out.println("timeBetween: " + d1.timeBetween(d2));
    }
}
