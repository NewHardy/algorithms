public class Sellection_Sort
{
    public static void sort(int[] array)
    {
        long time = System.currentTimeMillis();
        for (int i = 0; i < array.length-1 ; i++) 
        {
            int min=array[i];
            int minI=i;
            for (int j = i; j <= array.length-1; j++)
            {
                if (array[j]<min)
                {
                 minI=j;
                 min=array[j];
                }
            }
            if (array[i]!=min)
            {
                ArraysUtils.sellectionSwap(array,i,minI);
            }
        }
        long time2=System.currentTimeMillis();
        System.out.println("current time "+ (time2-time));
    }
}
