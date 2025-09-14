package DSA;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word to find out if its palindrome:");
        String word = in.nextLine();

        word = word.toLowerCase();

        boolean isPalindrome = true;

        int start = 0;
        int end = word.length() - 1;

        while (start <= end) {
            if (word.charAt(start) == word.charAt(end)) {
                start++;
                end--;
            } else {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("\n" + word + " is palindrome.");
        } else {
            System.out.println("\n" + word + " isn't a palindrome.");
        }
    }
}
