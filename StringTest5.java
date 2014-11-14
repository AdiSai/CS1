
/**
 * Write a description of class StringTest5 here.
 * 
 * @author (your name) 
 * @version (a version number or a string)
 */
public class StringTest5
{
     public static void main (String[] args)
    {
        String origstring = "Hello World";
        int x = origstring.length();
        String p1 = origstring.substring(0,1);
        String p2 = origstring.substring(1,x);
        String newstring = (p2+p1);
        System.out.println(newstring);
    }
}
