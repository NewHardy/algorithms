import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] ascending=ArraysUtils.generateAscendingArray(100000);
        int[] random=ArraysUtils.generateRandomArray(100000);
        int[] descending=ArraysUtils.generateDescendingArray(100000);

        System.out.println("Bubble sort time");
        Bubble_Sort.sort(ascending);
        Bubble_Sort.sort(random);
        Bubble_Sort.sort(descending);
        System.out.println("Selection sort time");
        Sellection_Sort.sort(ascending);
        Sellection_Sort.sort(random);
        Sellection_Sort.sort(descending);


    }
}