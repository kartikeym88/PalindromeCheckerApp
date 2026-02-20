// version 1.0
//author Kartikey
//useCase 1: Welcome page
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        SString original = "madam";

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(original).reverse().toString();

        // Check if the original equals the reversed version
        if (original.equals(reversed)) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is not a palindrome.");
        }
    }
}