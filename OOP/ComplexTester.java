
/**
 * Write a description of class ComplexTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComplexTester
{
   public static void main(String[] args)
   {
       ComplexNumber a = new ComplexNumber(2, 6);
       ComplexNumber b = new ComplexNumber(3, 7);
       ComplexNumber c = a.add(b);
       System.out.println(c);
       ComplexNumber d = new ComplexNumber(2,6);
       System.out.println(a.equals(d));
       System.out.println(a.abs(b));
       System.out.println(a.multiply(b));
   }
}
