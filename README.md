# UseCase13 — Performance Comparison of Palindrome Algorithms (Java)

## Overview

The PalindromeChecker App (UC13) is a console-based Java application that compares the performance of multiple palindrome checking approaches.

The application executes different algorithms on the same normalized input, measures their execution time using `System.nanoTime()`, and displays the results for comparison.

This use case focuses on understanding algorithm efficiency and basic benchmarking techniques.

---

## Objective

* Compare different palindrome checking approaches.
* Measure execution time using `System.nanoTime()`.
* Observe differences between algorithm implementations.
* Understand basic performance benchmarking concepts.

---

## Key Concepts Used

* Algorithm Comparison — Running multiple implementations on the same input.
* System.nanoTime() — High-resolution timing for execution measurement.
* Benchmarking Basics — Measuring relative performance.
* Normalization — Ensuring fair comparison using identical input.
* Multiple Algorithm Approaches — Two-pointer, Stack, Deque, and Recursive.

---

## Algorithm / Flow

1. Accept input string from the user.
2. Normalize the string (remove special characters and convert to lowercase).
3. Execute each palindrome algorithm:

    * Two-pointer approach
    * Stack-based approach
    * Deque-based approach
    * Recursive approach
4. Capture execution time before and after each algorithm.
5. Calculate elapsed time.
6. Display results and comparison.

