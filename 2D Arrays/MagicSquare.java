
/**
 * Write a description of class AA here.
 * 
 * Adithya Sairamachandran
 * @version (a version number or a date)
 */
import java.util.*;

public class MagicSquare 
{
    public static int[][] magic;
    
    public static void main(String[] args) 
    { 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of Magic square (must be odd): ");
        int n = s.nextInt(); // size
        if (n % 2 == 0) 
        {
            throw new RuntimeException("N must be odd");
        }

        magic = new int [n][n];// initialize magic here
        
        /*# 
         *   YOUR CODE HERE!!!!!
         *   HAVE FUN !!!!!
         */ 
        int row = 0;
        int col = n/2;
        int lastR = row;
        int lastC = col;
        int magic2DSize = n*n;

        magic[row][col] = 1;
         for (int j = 2; j < magic2DSize + 1; j++)
         {
               if ( row - 1 < 0)
               {
                   row = n - 1;
               }
               else
               {
                   row--;
               }
               if (col + 1 == n)
               {
                    col = 0;
               }
               else
               {
                   col++;
               }
               if (magic[row][col] == 0)
               {
                    magic[row][col] = j;
               }
               else
               {
                   row = lastR;
                   col = lastC;
                   if (row + 1 == n)
                   {
                       row = 0;
                    }
                    else
                    {
                        row++;
                    }
                    magic[row][col] = j;
               }
               lastR = row;
               lastC = col;
        }
        
        // prints out results will align up to 3 digit #s
        // Not necessary to modify below this line!
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (magic[i][j] < 10)  
                    System.out.print(" "); // extra space for alignment
                if (magic[i][j] < 100) 
                    System.out.print(" ");  // extra space for alignment
                System.out.print(magic[i][j] + " ");
            }
            System.out.println();
        }

    }
}
