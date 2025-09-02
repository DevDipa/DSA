package DSA;
import java.util.Arrays;

public class MinViaLS {
    public static void main(String[] args) {
        int[] arr = {45, 88, 15, 3, 9};

        System.out.print("The array: " + Arrays.toString(arr));
        System.out.println("\nThe minimum number in the array is: " + minNum(arr));
    }

    static int minNum(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
