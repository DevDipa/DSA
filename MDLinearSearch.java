package DSA;
import java.util.Arrays;

public class MDLinearSearch {
    public static void main(String[] args) {
        int[][] arr = {
                        {1, 5, 9},
                        {18, 88, 53}
                      };
        int target = 88; 

        System.out.print("The array: " + Arrays.deepToString(arr));
        int[] result = mdSearch(arr, target);
        System.out.println("\nThe index of " + target + " is:" + Arrays.toString(result));
    }

    static int[] mdSearch(int[][] arr, int target) {
        
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                      return new int[]{row, col};  
                }
            }
        }
      return new int[] {-1, -1};
    }

}
