# 🔄 Recursion in Programming

## Definition

**Recursion** is a process in which a function calls itself directly or indirectly. It allows the function to repeat its
logic to solve a problem, effectively acting as a functional alternative to traditional loops.

Notes here-> https://sl1nk.com/Ihhc4
---

## Why Use Recursion?

* ⭐ **Simplifies Complexity:** It helps in solving bigger or more complex problems in a simpler, more readable way.
* ⭐ **Divide and Conquer:** It is highly effective at breaking down a large problem into smaller, manageable
  sub-problems.
* ⭐ **Interchangeability:** You can convert a recursive solution into a loop (Iteration) and vice versa.

---

## Space Complexity Analysis

While recursion and iteration can solve the same problems, they handle memory differently:

| Feature              | Iteration (Loops)              | Recursion                                        |
|:---------------------|:-------------------------------|:-------------------------------------------------|
| **Space Complexity** | $O(1)$ (Constant)              | $O(N)$ (Linear)                                  |
| **Memory Usage**     | Uses a fixed amount of memory. | Uses the **Call Stack** for each recursive call. |

### Visual Representation

![Recursion.png](../Assets/Recursion.png)

> **Note:** Because every recursive call creates a new stack frame, the space complexity is $O(N)$. If the recursion is
> too deep without reaching a base case, it can lead to a **Stack Overflow** error.

---

## Key Takeaway

Recursion is a powerful tool for problems that have a repetitive structure (like Tree traversals or DFS), but it must be
used carefully due to its $O(N)$ memory overhead compared to the $O(1)$ efficiency of a standard loop.