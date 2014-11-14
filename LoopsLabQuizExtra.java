
/**
 * Write a description of class LoopsLabQuizExtra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import static java.lang.System.*;
public class LoopsLabQuizExtra
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      out.print("Please enter n: ");
      int n = scan.nextInt();
      out.print("Please enter the number of signs: ");
      int numofsigns = scan.nextInt();
      out.print("Please enter the number of dashes: ");
      int numofdashes = scan.nextInt();
      out.print("\n");
      int f = n;
      for (int i = 1; i <= f; i++)
      {
          for (int l = numofdashes; l >=0; l--)
          {
              out.print("#");
          }
          out.print(i);
          for (int l = numofdashes; l >=0; l--)
          {
              out.print("#");
          }
          for (int g = numofdashes; f >=0; g--)
          {
              out.print("-");
          }
          for (int l = numofdashes; l >=0; l--)
          {
              out.print("#");
          }
          out.print(n);
          for (int l = numofdashes; l >=0; l--)
          {
              out.print("#");
          }
          for (int g = numofdashes; f >=0; g--)
          {
              out.print("-");
          }
          for (int l = numofdashes; l >=0; l--)
          {
              out.print("#");
          }
          out.print(i);
          out.print("\n");
          n--;
      }
    }
}