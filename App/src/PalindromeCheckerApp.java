// version 1.0
//author Kartikey
//useCase 1: Welcome page
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "radar";
        String reversed = "";

        // Step 2: Use a for loop to reverse the string
        // We start from the last index (length - 1) and move to index 0
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i); // String concatenation
        }

        // Step 3: Compare content using .equals()
        if (original.equals(reversed)) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is not a palindrome.");
        }

        // Output the reversed result for clarity
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}