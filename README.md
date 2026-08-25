# ☕ Java-Assignment

A simple **Java console application** built as part of the Java course assignment.
The program analyzes numbers in different ways — printing sequences, checking even/odd, classifying numbers, and calculating sums — with every method fully documented using **JavaDoc** comments.

---

## 📌 Project Highlights

- ✅ Java project with a package named `javaAssignment`
- ✅ `NumberAnalyzer` class containing all the required methods
- ✅ `Main` class that runs and tests all methods sequentially (OOP-style file separation)
- ✅ Custom JavaDoc comments written in my own words for every method
- ✅ Java naming conventions followed (uppercase classes, lowercase methods, meaningful variable names)

---

## 🗂️ Project Structure

```text
Java-Assignment
└── src
    └── javaAssignment
        ├── NumberAnalyzer.java   → contains the 4 required methods (the logic)
        └── Main.java             → the runner class (tests all methods in sequence)
```

---

## ⚙️ Methods Overview

| Method | Description | Parameters | Return |
|--------|-------------|------------|--------|
| `printNumbersDescending()` | Prints numbers from 10 down to 1 | None | `void` |
| `printEvenOrOdd()` | Prints 1–10 and marks each one as Even or Odd | None | `void` |
| `checkNumberType(int number)` | Classifies the given number | `number` – the value to check | `"Positive"`, `"Negative"` or `"Zero"` |
| `calculateSum(int number1, int number2)` | Adds two numbers together | `number1`, `number2` – the values to add | The sum as `int` |

---

## 🖥️ Sample Output

```text
--- Testing Method 1---
10
9
8
7
6
5
4
3
2
1
--- Testing Method 2---
1-> Odd
2-> Even
3-> Odd
4-> Even
5-> Odd
6-> Even
7-> Odd
8-> Even
9-> Odd
10-> Even
--- Testing Method 3---
The number 5 is: Positive
--- Testing Method 4---
The sum of 10 and 20 is: 30
```

---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/YOUR_USERNAME/Java-Assignment.git
   ```
2. Open the project in **IntelliJ IDEA** (or any Java IDE).
3. Run the `main` method inside `Main.java`.

> 💡 Requires JDK 8+ (developed and tested with JDK 26).

---

## 📚 What Was Practiced in This Assignment

- Writing and calling **static methods**
- Using **loops** (`for`) and **conditionals** (`if / else`)
- Writing proper **JavaDoc** comments (`@param`, `@return`)
- Following Java **naming conventions**
- Using **Git & GitHub** for version control and submission

---

## 👤 Author

**Hosny Hassan**  — Java Course Assignment

---

## 🙏 Acknowledgments

This assignment was completed under the supervision of **Eng. Mohamed Abdelkader** and the mentorship of **Amr Khaled**.

