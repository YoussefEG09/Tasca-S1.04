# 📚 Java Unit Testing Exercises

This project contains a series of Java programming exercises focused on unit testing using **JUnit 5** and **AssertJ**. The exercises are split into two levels, covering fundamental testing concepts and Java collections.

---

## 🏆 Level 1: JUnit Exercises

### 📖 Exercise 1: Library Book Collection Manager

- Created a Java class to manage a library’s book collection.
- Features:
  - ➕ Add books to the collection.
  - 📋 Retrieve the full book list.
  - 🔎 Get a book title by position.
  - 🧩 Insert a book at a specific position.
  - 🗑️ Remove a book by title.
- ✅ JUnit tests verify:
  - The list is **not null** after creation.
  - Correct **list size** after adding books.
  - Books appear at the **correct position**.
  - No **duplicate book titles** exist.
  - Retrieval of title by **specific position**.
  - Adding a book **updates** the list correctly.
  - Removing a book **reduces** list size.
  - The list remains **alphabetically sorted** after changes.

---

### 🆔 Exercise 2: DNI Letter Calculator

- Built a `CalculoDni` class to calculate the letter of a Spanish DNI from its number.
- Used **parameterized JUnit tests** to:
  - Validate correct letter calculation across **10 predefined DNI numbers**.

---

### ⚠️ Exercise 3: Exception Handling

- Created a class method that throws `ArrayIndexOutOfBoundsException`.
- Tested with JUnit to ensure the **exception is thrown** correctly.

---

## 🚀 Level 2: AssertJ Exercises

### 1️⃣ Exercise 1: Integer Equality Assertions

- Asserted that:
  - Two integer objects have **equal values**.
  - Two integers are **not equal**.

---

### 2️⃣ Exercise 2: Object Reference Assertions

- Asserted:
  - Two references point to the **same object**.
  - Two references point to **different objects**.

---

### 3️⃣ Exercise 3: Integer Array Equality

- Verified two integer arrays are **identical** in contents and order.

---

### 4️⃣ Exercise 4: ArrayList with Multiple Object Types

- Created an `ArrayList` containing various types (`String`, `Integer`, `Double`, `Boolean`).
- Assertions:
  - Verify objects are in the **inserted order**.
  - Check the list **contains objects regardless of order**.
  - Assert one object is **present only once**.
  - Verify a **missing object is absent** from the list.

---

### 5️⃣ Exercise 5: Map Key Containment

- Created a `Map` and asserted it **contains a specific key**.

---

### 6️⃣ Exercise 6: Exception Assertion

- Caused an `ArrayIndexOutOfBoundsException`.
- Asserted with AssertJ that the **exception is thrown when expected**.

---

### 7️⃣ Exercise 7: Optional Empty Check

- Created an **empty** `Optional`.
- Asserted the `Optional` is **empty**.
