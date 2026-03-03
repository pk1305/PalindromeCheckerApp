
import java.util.Scanner;

public class UC12 {

    // Strategy Interface
    interface PalindromeStrategy {
        boolean isPalindrome(String str);
    }

    // Iterative Strategy
    static class IterativeStrategy implements PalindromeStrategy {

        public boolean isPalindrome(String str) {

            str = str.replaceAll("\\s+", "").toLowerCase();
            int left = 0, right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right))
                    return false;
                left++;
                right--;
            }
            return true;
        }
    }

    // Recursive Strategy
    static class RecursiveStrategy implements PalindromeStrategy {

        private boolean check(String str, int start, int end) {
            if (start >= end)
                return true;

            if (str.charAt(start) != str.charAt(end))
                return false;

            return check(str, start + 1, end - 1);
        }

        public boolean isPalindrome(String str) {
            str = str.replaceAll("\\s+", "").toLowerCase();
            return check(str, 0, str.length() - 1);
        }
    }

    // Context Class
    static class PalindromeContext {

        private PalindromeStrategy strategy;

        public PalindromeContext(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean execute(String str) {
            return strategy.isPalindrome(str);
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Choose strategy (change if needed)
        PalindromeStrategy strategy = new IterativeStrategy();
        // PalindromeStrategy strategy = new RecursiveStrategy();

        PalindromeContext context = new PalindromeContext(strategy);

        if (context.execute(input))
            System.out.println("The string is a Palindrome.");
        else
            System.out.println("The string is NOT a Palindrome.");

        sc.close();
    }
}