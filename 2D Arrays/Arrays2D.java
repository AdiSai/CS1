public class Arrays2D
{
    static final int ARR_SIZE = 10000;
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
        
        System.out.println();
        int totalsum = 0;
        int average = 0;
        for (int row=0; row<arr2D.length; row++)
        {
            for (int col=0; col<arr2D[row].length; col++)
            {
                totalsum = totalsum + arr2D[row][col];
            }
        }
        average = totalsum/((arr2D.length) * (arr2D[0].length));
        System.out.println("Sum: " + totalsum + "\n" + "Average: " + average + "\n");
        
        /*# INSERT YOUR BEAUTIFUL CODE HERE   */
        for (int row=0; row<arr2D.length; row++)
        {
            for (int col=0; col<arr2D[row].length; col++)
            {
                if (arr2D[row][col] < 500)
                {
                    arr2D[row][col] = 0;
                }
                else
                {
                    arr2D[row][col] = (int)(Math.random()*MAX_VALUE+1);
                }
            }
        }
        
        printArr(arr2D);  // print the after
        
        totalsum = 0;
        average = 0;
        for (int row=0; row<arr2D.length; row++)
        {
            for (int col=0; col<arr2D[row].length; col++)
            {
                totalsum = totalsum + arr2D[row][col];
            }
        }
        average = totalsum/((arr2D.length) * (arr2D[0].length));
        System.out.println("Sum: " + totalsum + "\n" + "Average: " + average + "\n");
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
