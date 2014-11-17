
/**
 * Write a description of class CheckingAcctTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class CheckingAcctTest
{
   public static void main (String[] args)
   {
       Scanner scan = new Scanner(System.in);
       System.out.println("Account name: ");
       String name = scan.nextLine();
       System.out.println("Account number: ");
       String num = scan.nextLine();
       System.out.println("Original Balance: ");
       double orig = scan.nextDouble();
       CheckingAccount test = new CheckingAccount(name, num, orig);
       CheckingAccount bob = new CheckingAccount("A", "1", 100);
//        System.out.println("Amount to deposit: ");
//        Double depvalue = scan.nextDouble();
//        test.deposit(depvalue);
//        System.out.println("Amount to withdraw: ");
//        double wvalue = scan.nextDouble();
//        test.withdraw(wvalue);
//        System.out.println(test);

        if (test.equals(bob))
        {
           System.out.println("Equal");
        }
        else 
        {
           System.out.println("Not equal");
        }
   }
}
