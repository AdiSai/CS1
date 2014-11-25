
/**
 * Write a description of class ReversalOfElements here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReversalOfElements
{
    public static void main(String[] args)
    {
        int[] data = {1, -7, 3, 4, 5, 6, 7, 8, 42, 155, 11, 12, 13, -20};
        int[] result = new int [ (data.length) ];
        int x = (data.length)-1;
        for (int i = 0; i < data.length; i++)
        {
            result[x] = data[i];
            x--;
        }
        for (int j = 0; j < result.length; j++)
        {
            System.out.println("The " + j +"th therm is: " + result[j] +".");
        }
    }
}
