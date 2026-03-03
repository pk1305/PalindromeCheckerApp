package PACKAGE_NAME;

public class UC5 {
=======
/**
 * =========================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a Stack data structure. Characters are pushed
 * into the stack and popped to compare in reverse order.
 *
 * At this stage, the application:
 * - Pushes characters into stack
 * - Pops characters for comparison
 * - Displays the validation result
 *
 * Data Structure: Stack
 *
 * @author Srishti Singh
 * @version 5.0
 */

import java.util.Scanner;
import java.util.Stack;

public class UC5 {

    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop characters and compare
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
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
