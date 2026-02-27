# UseCase10 — Case-Insensitive & Space-Ignored Palindrome Checker (Java)

## Overview

The PalindromeChecker App (UC10) is a console-based Java application that checks whether a given string is a palindrome while ignoring differences in letter case, spaces, and special characters.

The application first normalizes the input string through preprocessing and then applies a standard palindrome checking algorithm. This use case highlights the importance of input cleaning before algorithm execution.

---

## Objective

* Validate whether a string is a palindrome regardless of case and spacing.
* Demonstrate string preprocessing techniques.
* Apply regular expressions for input normalization.
* Reuse existing palindrome checking logic after preprocessing.

---

## Key Concepts Used

* String Preprocessing — Cleaning input before processing.
* Regular Expressions — Removing spaces and non-alphanumeric characters.
* Case Normalization — Converting text to lowercase.
* Two-Pointer Technique — Efficient palindrome validation.
* String / Array Handling — Character comparison operations.

---

## Algorithm / Flow

1. Accept input string from the user.
2. Normalize the string:

   * Remove spaces and special characters.
   * Convert all characters to lowercase.
3. Apply palindrome check using two-pointer comparison.
4. If all corresponding characters match → Palindrome.
5. Otherwise → Not palindrome.

