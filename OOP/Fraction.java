
public class Fraction 
{
    // Instance variables (fields):
    private int num;
    private int denom;

    // Constructors:
    public Fraction(int n, int d)
    {
        if (d == 0)
        {
            System.out.println("Fraction construction error: denominator is 0");
            num = 0;
            denom = 1;
        }
        else
        {
            num = n;
            denom = d;
            reduce();
        }
    }
    public Fraction(Fraction other)  // Copy constructor
    {
        num = other.num;
        denom = other.denom;
    }
    public Fraction()
    {
        num = 0;
        denom = 1;
    }
    public Fraction(int n)
    {
        num = n;
        denom = 1;
    }
    // Public methods:
    public Fraction add(Fraction other)
    {
        int newNum = num * other.denom + denom * other.num;
        // ABOVE COULD BE:
        // int newNum = this.num * other.denom + this.denom * other.num;
        int newDenom = denom * other.denom;
        // ABOVE COULD BE:
        //int newDenom = this.denom * this.other.denom;
        Fraction f = new Fraction(newNum, newDenom);
        return f;
    }
    public Fraction subtract(Fraction other)
    {
        int newNum = (num * other.denom) - (denom * other.num);
        int newDenom = denom * other.denom;
        Fraction  f = new Fraction(newNum, newDenom);
        return f;
    }
    public Fraction multiply(Fraction other)
    {
        int newNum = (num * other.denom) * (denom * other.num);
        int newDenom = denom * other.denom;
        Fraction f = new Fraction(newNum, newDenom);
        return f;
    }
    public Fraction divide (Fraction other)
    {
        int newNum = num * other.denom;
        int newDenom = denom * other.num;
        if (newDenom == 0)
        {
            Fraction f = new Fraction(newNum, 1);
            return f;
        }
        else
        {
            Fraction f = new Fraction(newNum, newDenom);
            return f;
        }
    }
    public String toString()
    {
        int n = num;
        int d = denom;
        return n + "/" + d;
    }
    public boolean equals(Fraction other)
    {
        if (this.num == (other.num) && other.num == (other.denom))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**#
     * < ... missing methods: subtract, multiply, and divide >
     */ 
    
    /*#
     * DO NOT EDIT BELOW THIS LINE, READ IF CURIOUS
     */
    public double getValue()
    {
        return (double)num / (double)denom;
    }
    
   
    // Static methods:
    public static Fraction valueOf(double x)
    {
        int n = (int) (x * 10000 + .5);
        int d = 10000;
        return new Fraction(n, d);
    }
    
    /**
     *  Returns the greatest common factor of two positive integers
     *  Precondition: n, d > 0
     */
    public static int gcf(int n, int d)
    {
        if (n <= 0 || d <= 0)
        {
            System.err.println("Fraction.gcf precondition failed: " + n + ", " + d);
            return 1;
        }
        int r = n % d;
        if (r == 0)
            return d;
        else
            return gcf(d, r); 
    }
    
    // Private methods:
    private void reduce()
    {
        if (num == 0)
        {
            denom = 1;
            return;
        }

        if (denom < 0)
        {
            num = -num;
            denom = -denom;
        }

        int q = gcf(Math.abs(num), denom);
        num /= q;
        denom /= q;    
    }
    
}
