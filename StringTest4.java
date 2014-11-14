
/**
 * Write a description of class StringTest4 here.
 * 
 * @author (your name) 
 * @version (a version number or a cc)
 */
public class StringTest4
{
     public static void main (String[] args)
    {
        String cc = "1111 2222 3333 4444";
        String p1 = cc.substring(13,14);
        String p2 = cc.substring(15,19);
        String newcc = (p1+p2);
        System.out.println(newcc);
    }
}
