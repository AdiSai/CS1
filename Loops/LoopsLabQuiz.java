
/**
 * Write a description of class LoopsLabQuiz here.
 * 
 * @author (Adithya Sairamachandran) 
 * @version (10/22/14)
 */
import java.util.*;
import static java.lang.System.*;
public class LoopsLabQuiz
{
  public static void main(String[] args)
  {
      Scanner scan = new Scanner(System.in);
      out.print("Enter n: ");
      int n = scan.nextInt();
      int f = n;
      for (int i = 1; i <= f; i++)
      {
          out.print("##" + i + "##");
          out.print("---");
          out.print("##" + n + "##");
          out.print("---");
          out.print("##" + i + "##");
          out.print("\n");
          n--;
      }
  }
}