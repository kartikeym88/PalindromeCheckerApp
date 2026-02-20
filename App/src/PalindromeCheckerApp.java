// version 1.0
//author Kartikey
//useCase 1: Welcome page
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        tring original = "racecar";

        // Step 1: Initialize Stack (LIFO) and Queue (FIFO)
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Step 2: Fill both structures
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }

        // Step 3: Compare Dequeue (Front) vs Pop (Back)
        boolean isPalindrome = true;
        while (!stack.isEmpty()) {
            // Queue.remove() gets the FIRST char, Stack.pop() gets the LAST char
            if (!stack.pop().equals(queue.remove())) {
                isPalindrome = false;
                break;
            }
        }

        // Step 4: Output result
        if (isPalindrome) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is not a palindrome.");
        }
    }
}