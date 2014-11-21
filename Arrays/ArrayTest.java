
/**
 * Write a description of class ArrayTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayTest
{
    public static void main(String[] args)
    {
        int[] valA = {13, -22, 82, 17};
        int[] valB = {-12, 24, -79, -13};
        int sum[] = new int [valA.length];
        for (int i = (sum.length) - 1; i >= 0; i--)
        {
            sum[i] = valA[i] + valB[i];
            System.out.println("Sum["+i+"] = " + sum[i]);
        }
}
}
