/**
 * Write a description of class ExtraCredit here.
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
        double val = 0; double change = 0;
        int choice;
        ArrayList<BankAccount> accts = new ArrayList<BankAccount>();
        System.out.println("Please enter a name to whom the account belongs.");
        st = scan.nextLine();
        System.out.println("Please input the initial value.");
        val = scan.nextDouble();
        BankAccount ba = new BankAccount(st, val);
        accts.add(ba);
        while (true)
        {
            System.out.println("\n" + "Please choose an option from below:");
            System.out.println("1: Deposit");
            System.out.println("2: Withdraw");
            System.out.println("3: Print Max");
            System.out.println("4: Exit");
            choice = scan.nextInt();
            if (choice == 1 || choice == 2 || choice == 3 || choice == 4)
            {
                if (choice == 1)
                {
                    System.out.println("Please enter the amount of the deposit:");
                    change = scan.nextDouble();
                    ba.deposit(change);
                }
                if (choice == 2)
                {
                    System.out.println("Please enter the amount of the withdrawl:");
                    change = scan.nextDouble();
                    ba.withdraw(change);
                }
                if (choice == 3)
                {
                    printLargest(accts);
                }  
                if (choice == 4)
                {
                    break;
                }
            } 
            else if (choice != 1 || choice != 2 || choice != 3 || choice != 4)
            {
                System.out.println(choice + " is not a valid option.");
            }
        }
        System.exit(0);
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
