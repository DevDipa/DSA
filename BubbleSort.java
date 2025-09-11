package DSA;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("The original unsorted array is: " + Arrays.toString(arr));
        bubble(arr);
        System.out.print("The sorted (bubble) array is: " + Arrays.toString(arr));

    }

    public static void bubble(int[] arr) {
        //the outer loop i is for passes i.e., pass 0, pass 1, and so on...
        for (int i = 0; i < arr.length ; i++) {
            //the inner loop is for traversing the array (from the 1st index)
            for (int j = 1; j < arr.length - i; j++) {
                //swapping logic for an ascending array
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

}
