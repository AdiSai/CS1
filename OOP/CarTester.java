
/**
 * Write a description of class CarTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class CarTester
{
   public static void main (String[] args)
   {
       Scanner scan = new Scanner (System.in);
       
       double startMiles, endMiles, gallons;
       double startMiles2, endMiles2, gallons2;
       
       System.out.println("Enter the first odometer reading: ");
       startMiles = scan.nextDouble(); //a  
       
       System.out.println("Enter the second odometer reading: ");
       endMiles = scan.nextDouble(); //b

       System.out.println("Enter the number of gallons used: ");
       gallons = scan.nextDouble(); //c
       
       Car car1 = new Car( startMiles, endMiles, gallons);
       
       System.out.println("The miles per gallon is " + car1.mpg());
       
       if (car1.gasHog() == true)
        {
            System.out.println("This car is a gas hog.");
        }
        else if (car1.ecoCar() == true)
       {
            System.out.println("This car is an Economy Car!");
       }
       
       System.out.println("\n" + "Enter the first odometer reading: ");
       startMiles2 = scan.nextInt();
       
       System.out.println("Enter the second odometer reading: ");
       endMiles2 = scan.nextDouble(); //b

       System.out.println("Enter the number of gallons used: ");
       gallons2 = scan.nextDouble(); //c
       
       car1.fillUp(startMiles, endMiles, gallons);
       
       System.out.println("The miles per gallon is " + car1.mpg());
       
       if (car1.gasHog() == true)
        {
            System.out.println("This car is a gas hog.");
        }
        else if (car1.ecoCar() == true)
       {
            System.out.println("This car is an Economy Car!");
       }
       //System.out.println("\n" + car1); //Car@(somejunk) = ClassName@(memory addr.) default
    }
}
