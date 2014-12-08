
public class Arrays2D
{
    static final int ARR_SIZE = 10;
    static final int MAX_VALUE = 1000;
    public static void main(String[] args)
    {
        int[][] arr2D = new int[ARR_SIZE][ARR_SIZE];
        
        for (int row=0; row<arr2D.length; row++)
        {
            for (int col=0; col<arr2D[row].length; col++)
            {
                arr2D[row][col] = (int)(Math.random()*MAX_VALUE+1);
            }
        }
        
        printArr(arr2D);  // print the before
        
        /*# INSERT YOUR BEAUTIFUL CODE HERE   */
        
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
