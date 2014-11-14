
/**
 * Write a description of class Loops4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import static java.lang.System.*;
public class Loops4
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the upper limit");
        int upperlimit = scan.nextInt();
        int squares = 0;
        int cubes = 0;
        int sqrsum = 0;
        int cubesum = 0;
        for (int i = 1; i<= upperlimit; i++)
        {
            squares = i * i;
            cubes = i * i * i;
            //out.println("The sum of Squares is " + squares);
            //out.println("The sum of Cubes is " + cubes);
            sqrsum = squares + sqrsum;
            cubesum = cubes + cubesum;
        }
        out.println("The square sum is " + sqrsum + "\n" + "The cubs sum is "+ cubesum);
    }
}
