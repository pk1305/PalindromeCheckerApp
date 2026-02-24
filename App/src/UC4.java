/**
 * =========================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by converting it into a character array and using
 * the two-pointer technique.
 *
 * At this stage, the application:
 * - Converts string to char[]
 * - Uses two-pointer approach
 * - Compares start & end characters
 * - Displays the validation result
 *
 * Data Structure: char[]
 *
 * @author Srishti singh
 * @version 4.0
 */

import java.util.Scanner;

public class UC4 {

    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] characters = input.toCharArray();

        int left = 0;
        int right = characters.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (left < right) {
            if (characters[left] != characters[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
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
