
/**
 * Write a description of class ReversalOfElements2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReversalOfElements2
{
    public static void main(String[] args)
    {
        int[] data = {1,-3, 3, 4, 5, 6, 7 ,8, 9, 10, 11, 12, -5, 14};
        int[] result = new int [ (data.length) ];
        int x = (data.length)-1;
        for (int i = 0; i < data.length; i++)
        {
            result[x] = data[i];
            x--;
            if (i == (data.length) -1)
            {
                 for (int j = 0; j < result.length; j++)
                 {
                      System.out.println("The " + j +"th therm is: " + result[j] +".");
                 }
            }
        }
    }
}