# UseCase7 — Deque-Based Optimized Palindrome Checker (Java)

## Overview

The PalindromeChecker App (UC7) is a console-based Java application that determines whether a given string is a palindrome using a Deque (Double Ended Queue) data structure.

Instead of reversing the string or using index pointers, the program inserts characters into a deque and compares elements from the front and rear simultaneously until all characters are validated.

This use case focuses on strengthening data structure understanding, particularly deque operations.

---

## Objective

* Validate whether a string is a palindrome.
* Demonstrate deque usage for front and rear comparison.
* Practice Java collections and core programming concepts.

---

## Key Concepts Used

* Deque (Double Ended Queue) — Allows insertion and deletion from both ends.
* Front and Rear Access — Enables direct comparison of first and last characters.
* Input Handling — Accepting user input using Scanner.
* String Normalization — Ignoring case and spaces for flexible validation.

---

## Algorithm / Flow

1. Accept input string from user.
2. Normalize input (remove spaces, convert to lowercase).
3. Insert each character into a deque.
4. Repeat until deque size > 1:

    * Remove first and last characters.
    * Compare them.
5. If mismatch occurs → Not palindrome.
6. If all comparisons match → Palindrome.

---

## File Name


PalindromeCheckerApp.java

