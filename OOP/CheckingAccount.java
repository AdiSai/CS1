
/**
 * Write a description of class CheckingAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CheckingAccount
{
    // instance variables - replace the example below with your own
    private String accountname;
    private String accountnumber;
    private double balance;
    private double balance1;
    private double balance2;
    private double depvalue;

    /**
     * Constructor(s) for objects of class CheckingAccount
     */
    public CheckingAccount(String a, String b, double c)
    {
        // initialise instance variables
        accountname = a;
        accountnumber = b;
        balance = c;
        balance1 = c;
        balance2 = c;
        depvalue = 0;
    }
    public CheckingAccount() // Secound constructor (default type)
    {
        accountname = "";
        accountnumber = "";
        balance = 0;
        balance1 = 0;
        balance2 = 0;
        depvalue = 0;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void deposit(double y)
    {
        // put your code here
        double balance = balance1 + y;
        depvalue = balance;
        System.out.println("New balance: " + balance);
    }
    public void withdraw(double y)
    {
        if ((balance - y) < 0)
        {
            System.out.println("I'm sorry, but you do not have sufficent amount in your account to withdraw $ " + y +" .");
            balance = (depvalue);
            System.out.println("Your curent balance: " + balance);
        }
        else 
        {
            balance = balance1 - y;
            System.out.println("New balance: " + balance);
        }
    }
    public boolean withdraw(double y, double z) //second methord with same name, but diff. parameters
    {
    if ((balance - y) + z < 0)
    {
        return true;
    }
    else
    {
        return false;
    }
    }
     public void internationalwithdraw(double y)
    {
        if ((balance - y) < 0)
        {
            System.out.println("I'm sorry, but you do not have sufficent amount in your account to withdraw $ " + y +" .");
            balance = (depvalue);
            balance = balance - 2.00;
            System.out.println("Your curent balance: " + balance);
        }
        else 
        {
            balance = balance1 - y;
            balance = balance - 2.00;
            System.out.println("New balance: " + balance);
        }
    }
    public String toString()
    {
        String s = ", the amount left in your account is: ";
        String t = "For " + accountname;
        double b = balance;
        return (t + s + b);
    }
    public boolean equals (CheckingAccount other)
    {
        if (this.accountname.equals(other.accountname) || this.accountnumber.equals(other.accountnumber) || this.balance == other.balance)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
