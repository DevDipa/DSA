package DSA;
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchviaRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int num = in.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The array looks like:" + Arrays.toString(arr));
        System.out.print("Enter the target element:");
        int target = in.nextInt();

        System.out.println("\nThe index of the target element is:" + search(arr, target, 0, arr.length - 1));
        in.close();
    }

    public static int search(int arr[], int target, int start, int end) {
        if (start > end) {
            return -1; //target not found
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid; //target found
        } else if (arr[mid] < target) {
            return search(arr, target, mid + 1, end); //search in the right half
        } else {
            return search(arr, target, start, mid - 1); //search in the left half
        }

    }
}
