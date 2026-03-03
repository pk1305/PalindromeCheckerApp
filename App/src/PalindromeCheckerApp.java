/**
        * =========================================================
        * MAIN CLASS - UseCase7PalindromeCheckerApp
 * =========================================================
         *
         * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
         * Description:
        * This class checks whether a string is a palindrome
 * using a Deque (Double Ended Queue). It compares
 * front and rear elements directly.
 *
         * At this stage, the application:
        * - Inserts characters into deque
 * - Removes first & last elements
 * - Compares them until deque is empty
 * - Displays the validation result
 *
         * Data Structure: Deque
 *
         * @author Developer
 * @version 7.0
        */

        import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class UseCase7PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear elements
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}