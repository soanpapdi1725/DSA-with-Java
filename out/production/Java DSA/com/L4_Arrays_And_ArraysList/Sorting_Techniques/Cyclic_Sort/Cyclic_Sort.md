# Cyclic Sort: Essential Guide

A mobile-optimized guide to the **Cyclic Sort** algorithm.

---

## 1. Introduction

**Cyclic Sort** is an **in-place** sorting algorithm used when data falls within a known range (like $1$ to $n$). It
works by placing each element at its correct index.



---

## 2. Core Requirements

For Cyclic Sort to work, the following must be true:

* **Continuous Range:** The numbers must fall within a specific, continuous range (e.g., $1, 2, 3 \dots n$).
* **Unsorted Input:** It is designed specifically to handle **unsorted** arrays.
* **Distinctness is Optional:** While it's easiest with unique numbers, it works perfectly for finding duplicates too.

---

## 3. How to Identify (LeetCode)

Look for these clues in problem descriptions:

* **Keywords:** "Numbers in range $[1, n]$" or "integers from $0$ to $n$."
* **The Goal:** Finding "missing," "duplicate," or "disappeared" numbers.
* **Requirements:** If the problem asks for **$O(n)$ time** and **$O(1)$ space**.

---

## 4. Complexity

### Time Complexity: $O(n)$

Even with a nested loop, each swap moves at least one number to its final spot. Total swaps are limited by the array
size $n$.

### Space Complexity: $O(1)$

The algorithm is **in-place**; it uses no extra data structures like HashSets or extra arrays.

---

## 5. Standard Template (Java)

```java
int i = 0;
while (i < nums.length) {
    // Correct index for value 'v' is 'v - 1'
    int correctPos = nums[i] - 1;

    // Only swap if the value isn't already 
    // in its correct spot
    if (nums[i] != nums[correctPos]) {
        swap(nums, i, correctPos);
    } else {
        i++;
    }
}