
/**
 * Write a description of class StringTest2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringTest2
{
     public static void main (String[] args)
    {
        String date = "05/28/1996";
        String p1 = date.substring(0,2);
        String p2 = date.substring(3,5);
        String p3 = date.substring(6,10);
        String newdate = (p2 + "-" + p1 + "-" + p3);
        System.out.println(newdate);
    }
}
