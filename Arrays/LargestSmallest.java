
/**
 * Write a description of class LargestSmallest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LargestSmallest
{
    public static void main(String[] args)
    {
    int[] data = {3, 1, 5, 7, 4, 12, 3, 8, 2};
    int maximum = data[0]; int minimum = data[0];
    for (int i = 0; i < data.length; i++)
    {
    if (data[i] < minimum)
    {
         minimum = data[i];
    }
    else if(data[i] > maximum)
    {
          maximum = data[i];
    }
    }
    System.out.println("The largest element: " + maximum + "\n" + "The smallest element: " + minimum);
}
}
