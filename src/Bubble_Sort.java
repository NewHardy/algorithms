import java.util.Arrays;

public class Bubble_Sort
{
    public static void sort(int[]array)
    {
        long time=System.currentTimeMillis();
        int res=0;
        for (int i = 0; i < array.length-1 ; i++)
        {
            boolean isSorted=true;
            for (int b = 0; b < array.length - 1; b++)
            {
                if (array[b] > array[b + 1])
                {
                    ArraysUtils.bubbleSwap(array,i);
                    isSorted=false;
                }
            }
            if (isSorted)
            {
                break;
            }
        }
        long time2=System.currentTimeMillis();
        System.out.println("current time "+ (time2-time));
    }
}
