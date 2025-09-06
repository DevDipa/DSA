package DSA;
import java.util.Scanner;
import java.util.Arrays;

public class BSin2D {
    public static void main(String[] args) {
        int[][] arr = {
                        {2, 4, 6, 8},
                        {5, 10, 15, 20},
                        {8, 16, 24, 32}
        };
        System.out.println("The 2D array looks like:" + Arrays.deepToString(arr));

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the target:");
        int target = in.nextInt();

        int[] result = binarySearch(arr, target);
        System.out.println("\nThe index of the target is: " + Arrays.toString(result));
        in.close();
    }

    public static int[] binarySearch(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;
        
        while (row < arr.length && col >= 0) {
            if (arr[row][col] < target) {
                row++;
            } else if (arr[row][col] > target) {
                col--;
            } else {
                return new int[]{row, col};
            }

        }

        return new int[] {-1, -1};
    }

}
