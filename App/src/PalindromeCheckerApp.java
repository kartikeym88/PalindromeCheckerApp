import java.util.*;

public class PalindromeCheckerApp {

    /* ---------- Normalization ---------- */
    public static String normalize(String input) {
        return input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    /* ---------- Two Pointer ---------- */
    public static boolean twoPointer(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l++) != str.charAt(r--)) return false;
        }
        return true;
    }

    /* ---------- Stack ---------- */
    public static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) stack.push(c);
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    /* ---------- Deque ---------- */
    public static boolean dequeMethod(String str) {
        Deque<Character> dq = new ArrayDeque<>();
        for (char c : str.toCharArray()) dq.addLast(c);

        while (dq.size() > 1) {
            if (!dq.removeFirst().equals(dq.removeLast())) return false;
        }
        return true;
    }

    /* ---------- Recursive ---------- */
    public static boolean recursive(String str, int s, int e) {
        if (s >= e) return true;
        if (str.charAt(s) != str.charAt(e)) return false;
        return recursive(str, s + 1, e - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        String str = normalize(input);

        /* Measure Two Pointer */
        long t1 = System.nanoTime();
        boolean r1 = twoPointer(str);
        long t2 = System.nanoTime();

        /* Measure Stack */
        long t3 = System.nanoTime();
        boolean r2 = stackMethod(str);
        long t4 = System.nanoTime();

        /* Measure Deque */
        long t5 = System.nanoTime();
        boolean r3 = dequeMethod(str);
        long t6 = System.nanoTime();

        /* Measure Recursive */
        long t7 = System.nanoTime();
        boolean r4 = recursive(str, 0, str.length() - 1);
        long t8 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Two Pointer: " + r1 + " | Time: " + (t2 - t1) + " ns");
        System.out.println("Stack:       " + r2 + " | Time: " + (t4 - t3) + " ns");
        System.out.println("Deque:       " + r3 + " | Time: " + (t6 - t5) + " ns");
        System.out.println("Recursive:   " + r4 + " | Time: " + (t8 - t7) + " ns");

        sc.close();
    }
}