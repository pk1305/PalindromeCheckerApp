
import java.util.Scanner;

public class UC11 {

    // Service class
    static class PalindromeService {

        public boolean isPalindrome(String str) {

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
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PalindromeService service = new PalindromeService();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (service.isPalindrome(input))
            System.out.println("The string is a Palindrome.");
        else
            System.out.println("The string is NOT a Palindrome.");

        sc.close();
    }
}