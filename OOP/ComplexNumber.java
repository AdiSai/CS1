/**
 * Write a description of class ComplexNumber here.
 * 
 * @author (Adithya Sairamachandran) 
 * @version (11/23/14)
 */
public class ComplexNumber
{
    // instance variables - replace the example below with your own
    private double real;
    private double imag;

    /**
     * Constructor for objects of class ComplexNumber
     */
     public ComplexNumber(double a, double b)
    {
        // initialise instance variables
        real = a;
        imag = b;
    }
    public ComplexNumber(double a)
    {
        // initialise instance variables
        real = a;
        imag = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double abs(ComplexNumber other)
    { 
        double a = this.real * other.real;
        double b = this.imag * other.imag;
        double c = Math.pow(a, 2.0);
        double d = Math.pow(b, 2.0);
        double x = Math.sqrt(c + d);
        return x;
    }
    public ComplexNumber add(ComplexNumber other)
    {
        // put your code here
        double a = ((this.real) + (other.real));
        double b = ((this.imag) + (other.imag));
        return new ComplexNumber(a , b);
    }
    public ComplexNumber multiply(ComplexNumber other)
    {
        double a = ((this.real) * (other.real));
        double b = ((this.imag) * (other.imag) * (-1));
        return new ComplexNumber(a, b);
    }
    public boolean equals(ComplexNumber other)
    {
        if (((this.real) == (other.real)) && ((this.imag) == (other.imag)))
        {
            return true;
        }
        return false;
    }
    public String toString()
    {
         if (imag < 0)
         {
             double x = real + imag;
             return real + " + "  + imag + " = " + x;
         }
             else
         {
             return real + " + " + imag +"i";
         }
    }
}
