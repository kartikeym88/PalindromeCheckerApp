# UseCase11 — Object-Oriented Palindrome Service (Java)

## Overview

The PalindromeChecker App (UC11) is a console-based Java application that validates whether a given string is a palindrome using an object-oriented design approach.

In this use case, the palindrome logic is encapsulated inside a dedicated service class. The application exposes a public method that performs preprocessing and palindrome validation while hiding internal implementation details.

This use case emphasizes clean architecture, modularity, and reusability.

---

## Objective

* Encapsulate palindrome logic inside a class.
* Provide a reusable method to check palindromes.
* Apply object-oriented design principles.
* Separate user interface logic from business logic.

---

## Key Concepts Used (OOPS)

* Encapsulation — Internal logic is hidden inside the class.
* Single Responsibility Principle — The service class handles only palindrome validation.
* Abstraction — Users interact through a public method without knowing implementation details.
* Method Design — Public API with private helper methods.
* Internal Data Handling — Uses String / Array processing internally.

---

## Algorithm / Flow

1. Accept input string from the user.
2. Create an instance of the PalindromeChecker class.
3. Call the public checkPalindrome() method.
4. Inside the service:

   * Normalize input (remove special characters and convert to lowercase).
   * Apply two-pointer palindrome comparison.
5. Return result to the main application.
6. Display whether the string is a palindrome.

