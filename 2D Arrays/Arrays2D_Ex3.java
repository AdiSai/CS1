public class Arrays2D_Ex3
{
    static int ARR_SIZE = 10;
    static int MAX_VALUE = 100;
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
        
        System.out.println();
        
        /*# INSERT YOUR BEAUTIFUL CODE HERE   */
        int temp = 0;
        int x = arr2D.length - 1;
        int y = arr2D.length - 1;
        for (int row=0; row<arr2D.length; row++)
        {
           for (int col=0; col<arr2D[0].length; col++)
            {
                 temp = arr2D[row][col];
                 arr2D[col][row] = temp;
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