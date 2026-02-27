import java.util.Scanner;

public class PalindromeCheckerApp {

    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Build linked list from string
    public static Node buildList(String input) {
        Node head = null, tail = null;

        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    // Reverse linked list
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Palindrome check
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        Node slow = head;
        Node fast = head;

        // Find middle
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow.next);

        Node p1 = head;
        Node p2 = secondHalf;

        boolean result = true;

        // Compare halves
        while (p2 != null) {
            if (p1.data != p2.data) {
                result = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // Restore list (good practice)
        slow.next = reverse(secondHalf);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine()
                .replaceAll("\\s+", "")
                .toLowerCase();

        Node head = buildList(input);

        if (isPalindrome(head)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}