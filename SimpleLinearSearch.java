package DSA;
import java.util.Scanner;
import java.util.Arrays;

public class SimpleLinearSearch {
    public static void main(String[] main) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the length of an array for linear search:");
        int len = in.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("The array elements are:" + Arrays.toString(arr));
        
        System.out.println("Enter the targer element:");
        int target = in.nextInt();

        System.out.println("The target is in index: " + linearSearch(arr, target));
        in.close();
    }

    static int linearSearch(int[] arr, int target) {
        int index = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        return index;

    }

}
