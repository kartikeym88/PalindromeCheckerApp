// version 1.0
//author Kartikey
//useCase 1: Welcome page
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Step 1: Define the input string
        String original = "level";

        // Step 2: Convert String to Character Array
        char[] charArray = original.toCharArray();

        // Step 3: Initialize Two Pointers
        int left = 0;
        int right = charArray.length - 1;
        boolean isPalindrome = true;

        // Step 4: Compare characters from both ends
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break; // Exit early if a mismatch is found
            }
            left++;  // Move forward
            right--; // Move backward
        }

        // Step 5: Output the result
        if (isPalindrome) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is not a palindrome.");
        }
    }
}