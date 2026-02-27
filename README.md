# UseCase12 — Strategy Pattern for Palindrome Algorithms (Java)

## Overview

The PalindromeChecker App (UC12) is a console-based Java application that validates whether a given string is a palindrome using the Strategy Design Pattern.

Instead of using a single fixed algorithm, the application allows selecting different palindrome checking strategies at runtime. Each strategy implements a common interface while using its own internal data structure and logic.

This use case demonstrates flexible design, extensibility, and runtime behavior selection.

---

## Objective

* Choose a palindrome algorithm dynamically at runtime.
* Apply the Strategy Design Pattern.
* Demonstrate polymorphism using interfaces.
* Separate algorithm implementations from the main application.

---

## Key Concepts Used

* Interface — Defines a common contract for palindrome strategies.
* Polymorphism — Different implementations behave through the same interface.
* Strategy Pattern — Enables dynamic selection of algorithms.
* Dependency Injection — Strategy provided to the service at runtime.
* Data Structure Variation — Stack, Deque, or other structures per strategy.

---

## Algorithm / Flow

1. Accept input string from the user.
2. Ask the user to choose a palindrome strategy.
3. Create a strategy implementation (Stack or Deque).
4. Inject the selected strategy into the service class.
5. Service delegates palindrome checking to the chosen strategy.
6. Display the result.


