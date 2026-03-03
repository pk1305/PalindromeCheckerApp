
import java.util.LinkedList;
import java.util.Scanner;

public class UC8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        // Add characters to linked list
        for (char ch : str.toCharArray()) {
            list.add(ch);
        }

        boolean isPalindrome = true;

        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("The string is a Palindrome.");
        else
            System.out.println("The string is NOT a Palindrome.");

        sc.close();
    }
}