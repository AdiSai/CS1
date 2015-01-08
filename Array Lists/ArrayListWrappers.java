
/**
 * Write a description of class ArrayListWrappers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class ArrayListWrappers
{
    public static void main(String[] args)
    {
        ArrayList<Integer> intlist = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++)
        {
            intlist.add(i);
        }
        for (int num : intlist)
        {
            System.out.print(num + "  ");
            num++;
        }
        System.out.println();
        
        ArrayList<Double> dbllist = new ArrayList<Double>();
        for (double j = 0; j <= 20; j++)
        {
           dbllist.add(j);
        }
        for (double dbls : dbllist)
        {
            System.out.print(dbls + "  ");
            dbls++;
        }
        System.out.println();
        
        ArrayList<Character> charlist = new ArrayList<Character>();;
        for (char k = 'A'; k <= 'Z'; k++)
        {
           charlist.add(k);
        }
        for (char chars : charlist)
        {
            System.out.print(chars + "  ");
            chars++;
        }
        System.out.println();
        
        String w = "3.14159";
        double x = Double.parseDouble(w);
        System.out.println(x);
        String y = "-321";
        int z = Integer.parseInt(y);
        System.out.println(z);
    }
}
