
/**
 * Write a description of class A here.
 * 
 * Adithya Sairamachandran
 * @version (a version number or a date)
 */
public class BankAccount
{
    private String name;
    private double balance;

    public BankAccount(String nm, double amnt)
    {
        name = nm;
        balance = amnt;
    }

    public void deposit(double dp)
    {
        if (dp > 0 && dp < (Double.MAX_VALUE))
        {
            balance = balance + dp;
        }
    }
    public void withdraw(double wd)
    {
        if (balance > (balance - wd))
        {
            balance = balance - wd;
        }
    }
    public String getName()
    {
        return name;
    }
    public double getBalance()
    {
        return balance;
    }
    public String toString()
    {
        String n = name;
        double bal = balance;
        String r = ("[" + name + ", $" + bal + "]");
        return r;
    }
}
