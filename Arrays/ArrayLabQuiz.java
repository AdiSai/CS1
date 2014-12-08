
/**
 * Write a description of class ArrayLabQuiz here.
 * 
 * @author (Adithya Sairamachandran) 
 * @version (12/4/14)
 */
public class ArrayLabQuiz
{
    public static void main(String[] args)
    {
        int[] signal = {1, 3, 7, 2, 6, 6, 3, 2, 5, 4, 1, 5};
        int[] smooth = new int[ (signal.length) ];
        int x = ((signal.length)-1);
        for (int i = 0; i < x; i++)
        {
            if (i == 0)
            {
                smooth[0] = (signal[0] + signal[1])/2;
            }
            else if(i == x)
            {
                smooth[i] = (signal[x - 1] + signal[x])/2;
            }
            else
            {
                int k = (signal[i]);
                int l = (signal[i - 1]);
                int m = (signal[i + 1]);
                smooth[i] = (k + l + m)/3;
            }
        }
        for(int j = 0; j < (smooth.length); j++)
        {
            System.out.print("signal[" + j + "] = " + signal[j]);
            System.out.print("\t");
            System.out.println("smooth[" + j + "] = " + smooth[j]);
        }
    }
}
