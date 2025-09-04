package DSA;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchSimple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int num = in.nextInt();
        int[] arr = new int[num];

        System.out.println("\nEnter " + num + " elements in the array:");
        for (int i = 0;  i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("The array looks like: " + Arrays.toString(arr));

        System.out.print("Set the target element: ");
        int target = in.nextInt();

        System.out.println("\nThe target: " + target + " lies in the index: " + binarySearch(arr, target));
        in.close();
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        boolean isAsc = false;

        if (arr[start] <= arr[end]) {
            isAsc = true;
        }

        if (isAsc) {
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (arr[mid] < target) {
                    start = mid + 1;

                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    return mid;
                 }
            }

        } else {
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (arr[mid] > target) {
                     start = mid + 1;
                } else if (arr[mid] < target) {
                      end = mid - 1;
                } else {
                     return mid;
                 }
            }
        }

        return -1;
    }

}
