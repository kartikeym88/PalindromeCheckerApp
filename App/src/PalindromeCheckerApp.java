import java.util.Scanner;

public class PalindromeCheckerApp {

    // Recursive palindrome check
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Mismatch condition
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call (inner substring)
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine()
                .replaceAll("\\s+", "")
                .toLowerCase();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}