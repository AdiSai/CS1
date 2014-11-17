
/**
 * Write a description of class MonstreTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class MonstrerTester
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the moster strength (must be from 1 to 100): ");
        int str = scan.nextInt();
        Monster bob = new Monster(str);
        bob.talk();
    }
}
