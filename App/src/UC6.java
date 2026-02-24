/**
 * =========================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using both Queue (FIFO) and Stack (LIFO).
 *
 * At this stage, the application:
 * - Enqueues characters into a queue
 * - Pushes characters into a stack
 * - Compares dequeue (queue) with pop (stack)
 * - Displays the validation result
 *
 * Data Structures: Queue, Stack
 *
 * @author Srishti Singh
 * @version 6.0
 */

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class UC6 {

    /**
     * Application entry point for UC6.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);     // Enqueue (FIFO)
            stack.push(ch);    // Push (LIFO)
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
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
