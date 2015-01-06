import java.util.*;

public class MagicSquare 
{
    public static int[][] magic;
    
    public static void main(String[] args) 
    { 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of Magic square (must be odd): ");
        int n = s.nextInt();
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
        int nextR = row;
        int nextC = col;
        int matrixSize = n*n;

        magic[row][col] = 1;
            for (int j = 2; j < n; j++)
            {
               if (j > col)
               {
                   row++;
                   col = 0;
                   nextR = 0;
                   nextC = 0;
               }
               if (magic[row][col] != 0)
               {
                    magic[row][col] = j;
                    nextR--;
                    nextC++;
               }
               if (magic[row][col] == 0)
               {
                    magic[row][col] = j;
                    row++;
                    col--;
               }
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
