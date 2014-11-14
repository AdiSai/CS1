
/**
 * Write a description of class Data3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Data3
{
   public static void main (String[] args)
   {
       String strnew = "THIS IS A VERY LONG STRING FOR COMPUTER SCIENCE 1 IN 1208S";
       int x = 17;
       String strnewsubs = strnew.substring(x);

       int strnewlen = strnew.length();
       // Would be declared here: int x = 17;
       
       System.out.println("The length of, " + "\"" + strnew + "\"" + " is " + strnewlen + " .");
       System.out.println("The Substring of, " + "\"" + strnew + "\"" + " is " + strnewsubs + " at a length of " + x + " .");   
    }
}
