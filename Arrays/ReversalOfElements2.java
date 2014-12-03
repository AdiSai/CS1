
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
        //int[] result = new int [ (data.length) ];
        int x = (data.length) - 1;
        for (int i = 0; i < x; i++)
        {        
                int temp = data[i];
                data[i] = data[x];
                data[x] = temp;
                x--;
        }
        for (int j = 0; j < data.length; j++)
        {
            System.out.println("The " + j +"th therm is: " + data[j] +".");
        }
    }
}