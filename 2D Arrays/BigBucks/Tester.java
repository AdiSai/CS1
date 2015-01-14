
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Tester
{
    public static void main(String[] args)
    {
        Scanner scan  = new Scanner(System.in);
        String st = "";
        double val = 0;
        ArrayList<BankAccount> accts = new ArrayList<BankAccount>();
        for (int i = 0; i < Integer.MAX_VALUE; i++)
        {
            System.out.println("Please enter a name to whom the account belongs. (\"Exit\" to abort)");
            st = scan.nextLine();
            if (st.equals("Exit"))
            {
                break;
            }
            System.out.println("Please enter the amount of the deposit");
            val = scan.nextDouble();
            System.out.println();
            scan.nextLine();
            BankAccount ba = new BankAccount(st, val);
            accts.add(ba);
        }
        printLargest(accts);
    }
    
    public static void printLargest(ArrayList<BankAccount> acctsList)
    {
        double max = 0;
        String name = "";
        for (int i = 0; i < acctsList.size(); i++)
        {
            BankAccount x = acctsList.get(i);
            if (x.getBalance() > max)
            {
                max = x.getBalance();
                name = x.getName();
            }
        }
        System.out.println(name + " had the max account value, with $" + max);
    }
}
