public class ChiptoleBurrito
{
    // instance variables
    public double price;
    public int calories;

    /**
     * Constructor for objects of class ChiptoleBurrito
     */
    public ChiptoleBurrito()
    {
        // initialise instance variables
        price = 6.89;
        calories = 660;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int changePrice(double x)
    {
        price = x;
        return 0;
    }
    public int addGuac()
    {
        // put your code here
        calories = calories + 150;
        price = price + 1.50;
        return 0;
    }
    public void noBeans()
    {
        calories -= 70;
    }
    public void extraBeans()
    {
        calories = calories + 70;
        price = price + 0.50;
    }
    public void studentDiscount()
    {
        price = price - 1.99;
    }
    public String toString()
    {
        String s = "The final price is: " + "$" + price;
        return s;
    }
    public boolean equals(ChiptoleBurrito other)
    {
        if (this.price == (other.price) && this.calories == (other.calories))
        {
            return true;
        }
        else
        {
            return false;
        }
     }
    }