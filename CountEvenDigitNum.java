package DSA;
import java.util.Arrays;

public class CountEvenDigitNum {
    public static void main(String[] main) {
        int[] arr = {25, 1, 5555, 53, 9};
        System.out.println("Our array looks like this: " + Arrays.toString(arr));

        int numCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int digitCount = 0; 

            while (num != 0) {
                digitCount += 1;
                num /= 10;
            }

            if (digitCount % 2 == 0) {
                numCount += 1;
            }
        }

        System.out.println("The count of numbers having even-digit-num is: " + numCount);
    }
}
