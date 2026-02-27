# UseCase8 — Linked List Based Palindrome Checker (Java)

## Overview

The PalindromeChecker App (UC8) is a console-based Java application that checks whether a given string is a palindrome using a Singly Linked List.

The application converts the input string into a linked list, finds the middle of the list using the fast and slow pointer technique, reverses the second half in place, and compares both halves to determine whether the string is a palindrome.

This use case focuses on pointer manipulation, linked list traversal, and in-place algorithm design.

---

## Objective

* Validate whether a string is a palindrome using a linked list.
* Demonstrate singly linked list creation and traversal.
* Apply fast and slow pointer technique to find the middle.
* Perform in-place reversal of the second half without extra memory.

---

## Key Concepts Used

* Singly Linked List — Dynamic structure where nodes are connected using references.
* Node Traversal — Sequential access using next pointers.
* Fast and Slow Pointer Technique — Efficient middle detection in O(n).
* In-Place Reversal — Reversing part of the list without additional data structures.
* Comparison of List Halves — Validating palindrome property.

---

## Algorithm / Flow

1. Accept input string from the user.
2. Normalize input (remove spaces and convert to lowercase).
3. Convert the string into a singly linked list.
4. Use fast and slow pointers to locate the middle node.
5. Reverse the second half of the linked list.
6. Compare the first half and reversed second half node by node.
7. If all nodes match → Palindrome.
8. Restore the list (optional good practice).

