
/**
 * Write a description of class FractionTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FractionTester
{
    public static void main (String[] args)
    {
        Fraction noGo = new Fraction(2, 0);
        Fraction f1 = new Fraction(7, 11);
        System.out.println("Fraction f1 is: " + f1);
        Fraction f2 = new Fraction(6, 9);
        System.out.println("Fraction f2 is: " + f2);
        Fraction f3 = new Fraction(2, 3);
        System.out.println("Fraction f3 is: " + f3);
        if (f2.equals(f3))
        {
            System.out.println("Fractions f2 (" + f2 + ") and f3 (" + f3 + ") are equal.");
        }
        else
        {
            System.out.println("Fractions f2 (" +f2 + ") and f3 (" + f3 + ") are NOT equal.");
        }
        Fraction sumf1f2 = f1.add(f2);
        Fraction sumf2f3 = f2.add(f3);
        System.out.println(f1 + " plus " + f2 + " equals " + sumf1f2);
        System.out.println(f2 + " plus " + f3 + " equals " + sumf2f3);
        Fraction subf1f2 = f1.subtract(f2);
        Fraction subf2f3 = f2.subtract(f3);
        System.out.println(f1 + " minus " + f2 + " equals " + subf1f2);
        System.out.println(f2 + " minus " + f3 + " equals " + subf2f3);
        Fraction multiplyf1f2 = f1.multiply(f2);
        Fraction multiplyf2f3 = f2.multiply(f3);
        System.out.println(f1 + " multiplied by " + f2 + " equals " + multiplyf1f2);
        System.out.println(f2 + " multiplied by " + f3 + " equals " + multiplyf2f3);
        Fraction dividef1f2 = f1.divide(f2);
        Fraction dividef2f3 = f2.divide(f3);
        System.out.println(f1 + " divided by " + f2 + " equals " + dividef1f2);
        System.out.println(f2 + " divided by " + f3 + " equals " + dividef2f3);
}
}
