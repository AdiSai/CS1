
/**
 * Write a description of class ExtraCredit  here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class ExtraCredit
{
    public static void main(String[] args)
    {
        Scanner scan  = new Scanner(System.in);
        String st = "";
        double val = 0;
        ArrayList<BankAccount> accts = new ArrayList<BankAccount>();
        System.out.println("Please choose an option from below:");
        System.out.println("1: Deposit");
        System.out.println("2: Withdraw");
        System.out.println("3: Print Max");
        System.out.println("4: Exit");
        System.out.println();
        int choice = scan.nextInt();
        if (choice == 1 || choice == 2 || choice == 3 || choice == 4)
        {
           if (choice == 1)
           {
               
           }
           if (choice == 2)
           {
               
           }
           if (choice == 3)
           {
               printLargest(accts);
           }  
           if (choice == 4)
           {
              System.exit(0);
           }
        } 
        else if (choice != 1 || choice != 2 || choice != 3 || choice != 4)
        {
            System.out.println(choice + " is not a valid option.");
            System.err.println(choice + " is out of bounds.");
        }
//         for (int i = 0; i < Integer.MAX_VALUE; i++)
//         {
//             System.out.println("Please enter a name to whom the account belongs. (\"Exit\" to abort)");
//             st = scan.nextLine();
//             if (st.equals("Exit"))
//             {
//                 break;
//             }
//             System.out.println("Please enter the amount of the deposit");
//             val = scan.nextDouble();
//             System.out.println();
//             scan.nextLine();
//             BankAccount ba = new BankAccount(st, val);
//             accts.add(ba);
//         }
//         printLargest(accts);
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
