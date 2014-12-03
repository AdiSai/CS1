
/**
 * Write a description of class WeightTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WeightTester
{
    public static void main(String[] args)
    {
         int[] values = {100, 100, 100, 99, 1};
         Weight june = new Weight(values);
         int avgjune = june.average();
         System.out.println("The average of june is: " + avgjune);
    }
}
