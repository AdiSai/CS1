import java.util.*;
public class Arrays2D_Ex1
{
    static int ARR_SIZE = 10;
    static int MAX_VALUE = 100;
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Favorite Number: ");
        int favnum = scan.nextInt();
        int[][] arr2D = new int[ARR_SIZE][ARR_SIZE];
        
        for (int row=0; row<arr2D.length; row++)
        {
            for (int col=0; col<arr2D[row].length; col++)
            {
                arr2D[row][col] = (int)(Math.random()*MAX_VALUE+1);
            }
        }
        
        printArr(arr2D);  // print the before
        
        System.out.println();
        
        /*# INSERT YOUR BEAUTIFUL CODE HERE   */
        for (int row=0; row<arr2D.length; row++)
        {
            for (int col=0; col<arr2D[row].length; col++)
            {
                if (arr2D[row][col] ==  arr2D[col][row])
                {
                    arr2D[row][col] = favnum;
                }
            }
        }
        
        printArr(arr2D);  // print the after
        
      
    }//end main

    public static void printArr(int[][] arrToPrint)
    {
        for (int r=0; r<arrToPrint.length; r++)
        {
            for (int c=0; c<arrToPrint[r].length; c++)
            {
                if (arrToPrint[r][c] < 10)
                    System.out.print(" ");
                if (arrToPrint[r][c] < 100)
                    System.out.print(" ");
                System.out.print(arrToPrint[r][c]+"  ");
            } // end of row
            System.out.println(); //change lines
        }
    }
}
