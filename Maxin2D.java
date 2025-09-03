package DSA;
import java.util.Arrays;

public class Maxin2D {
    public static void main(String[] args) {
        int[][] arr = {
                        {1, 25, 3}, 
                        {4, 55, 6 }, 
                        {7, 8, 99}
                      };

        int[] result = maxSearch(arr);
        System.out.println("The largest element in the above 2D array is the index " + Arrays.toString(result));
    }

    public static int[] maxSearch(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int row = -1; 
        int col = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row, col};
        
    }

}
