
import java.util.Scanner;

public class UC13 {

    // Iterative Method
    public static boolean iterativePalindrome(String str) {

        str = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    // Recursive Method
    public static boolean recursivePalindrome(String str, int start, int end) {

        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return recursivePalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String processed = input.replaceAll("\\s+", "").toLowerCase();

        // Measure Iterative Time
        long startIter = System.nanoTime();
        boolean iterResult = iterativePalindrome(input);
        long endIter = System.nanoTime();

        // Measure Recursive Time
        long startRec = System.nanoTime();
        boolean recResult = recursivePalindrome(processed, 0, processed.length() - 1);
        long endRec = System.nanoTime();

        System.out.println("\nIterative Result: " + iterResult);
        System.out.println("Iterative Time: " + (endIter - startIter) + " ns");

        System.out.println("\nRecursive Result: " + recResult);
        System.out.println("Recursive Time: " + (endRec - startRec) + " ns");

        sc.close();
    }
}