
/**
 * Write a description of class ThreeSums here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThreeSums
{
   public static void main(String[] args)
   {
       int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
       int evensum = 0;
       int oddsum = 0;
       int average = 0;
       int finalsum = 0;
       for (int i = 0; i < data.length; i++)
       {
           finalsum = finalsum + data[i];
           if ((data[i])%2 == 0)
           {
               evensum = evensum + data[i];
           }
           else
           {
                oddsum = oddsum + data[i];
           }
       }
       System.out.println("Final sum: " + finalsum + "\n" + "Even sum: " + evensum + "\n" + "Odd sum: " + oddsum);
    }
}
