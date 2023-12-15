import java.util.Random;

public class ArraysUtils
{
    public static void bubbleSwap(int[]array,int i)
    {
        int res= array[i];
        array[i] =array[i+1];
        array[i+1]=res;
    }
    public static void sellectionSwap(int[]array,int i,int minI)
    {
        int res= array[i];
        array[i] =array[minI];
        array[minI]=res;
    }
    public static int[] generateAscendingArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i + 1;
        }
        return array;
    }


    public static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(length);
        }
        return array;
    }

    public static int[] generateDescendingArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = length - i;
        }
        return array;
    }
}
