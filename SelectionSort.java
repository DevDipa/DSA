package DSA;
import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the array:");
        int length = in.nextInt();

        System.out.println("\nEnter the array elements (Preffered: Unsorted):");
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
            
        }

        System.out.println("Your array looks like: " + Arrays.toString(arr));

        selection(arr);
        System.out.println("After Selection Sort, your array looks like: " + Arrays.toString(arr));
    }


    public static void selection(int[] arr) {
        //iteration
        for (int i = 0; i < arr.length; i++) {
            //since this is for ascending sorting, we'll find the largest element in the Unsorted portion, and place it at its end via swapping
            int lastIndexofUnsortedPortion = arr.length - i - 1;
            int maxElementIndex = getMaxIndex(arr, 0, lastIndexofUnsortedPortion);
            swap(arr, maxElementIndex, lastIndexofUnsortedPortion);
        }

    }

    public static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = 1; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
