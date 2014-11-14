
/**
 * Write a description of class StringTest3 here.
 * 
 * @author (your name) 
 * @version (a version number or a ss)
 */
public class StringTest3
{
    public static void main (String[] args)
    {
        String ss = "123-45-6789";
        String p1 = ss.substring(0,3);
        String p2 = ss.substring(4,6);
        String p3 = ss.substring(7,11);
        String newss = (p1+p2+p3);
        System.out.println(newss);
    }
}
