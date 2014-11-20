
/**
 * Write a description of class ComplexNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        a = real;
        imag = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public ComplexNumber add(ComplexNumber other)
    {
        // put your code here
        double a = ((this.real) + (other.real));
        double b = ((this.imag) + (other.imag));
        return new ComplexNumber(a , b);
    }
//     public ComplexNumber multiply(ComplexNumber other)
//     {
//         double a = ((this.real) * (other.real));
//         double b = ((this.imag) * (other.imag));
//         return new ComplexNumber(a, b);
//     }
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
        return real + " + " + imag +"i";
    }
}
