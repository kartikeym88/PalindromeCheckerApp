# UseCase9 — Recursive Palindrome Checker (Java)

## Overview

The PalindromeChecker App (UC9) is a console-based Java application that determines whether a given string is a palindrome using recursion.

The application compares characters from the start and end of the string through recursive calls. Each call processes a smaller substring until a base condition is reached, which terminates the recursion.

This use case focuses on understanding recursive problem solving, base conditions, and call stack behavior.

---

## Objective

* Validate whether a string is a palindrome using recursion.
* Demonstrate recursive function design.
* Understand base condition and recursive case.
* Learn how the call stack manages recursive calls.

---

## Key Concepts Used

* Recursion — A method calls itself to solve smaller subproblems.
* Base Condition — Stops recursion and prevents infinite calls.
* Recursive Case — Compares characters and moves toward the center.
* Call Stack — Stores method calls during recursion execution.
* String Normalization — Removing spaces and ignoring case.

---

## Algorithm / Flow

1. Accept input string from the user.
2. Normalize input (remove spaces and convert to lowercase).
3. Call recursive function with start index = 0 and end index = length − 1.
4. Base condition:

    * If start ≥ end → Palindrome.
5. Compare characters at start and end:

    * If mismatch → Not palindrome.
6. Otherwise recursively check the inner substring (start+1, end−1).

