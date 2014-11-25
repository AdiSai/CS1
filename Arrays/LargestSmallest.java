
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
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    int maximum = Integer.MAX_VALUE; int minimum = Integer.MIN_VALUE; int smallest = 0; int largest = 0;
    for (int i = 0; i < data.length; i++)
    {
    if (data[i] > minimum)
    {
         minimum = data[i];
    }
    else if(data[i] < maximum)
    {
          maximum = data[i];
    }
    }
    System.out.println("The largest element: " + minimum + "\n" + "The smallest element: " + maximum);
}
}
