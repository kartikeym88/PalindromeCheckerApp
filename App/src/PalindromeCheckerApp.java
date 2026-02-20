// version 1.0
//author Kartikey
//useCase 1: Welcome page
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "noon";

        // Step 1: Initialize a Stack of Characters
        Stack<Character> stack = new Stack<>();

        // Step 2: Push all characters of the string into the stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        // Step 3: Pop characters to build the reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Step 4: Final comparison
        if (original.equals(reversed)) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is not a palindrome.");
        }
    }
}