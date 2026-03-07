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

---

## Recursion Types

### Tail Recursion

* Where recursive Function call is the last operation of the function
* and future function does not interact with any other function such as in addition or something

```java
static void print(int n) {
    if (n == 5) { // base case where function stops
        System.out.println(n);
        return;
    }
    System.out.println(n);

    //here recursive function call is not doing any +, - with future recursion calls
    // and also does not depend on them for completion
    print(n + 1);
}
```

### Non Tail Recursion

* Where recursive Function call is not last operation of the function
* future function does interact with any other function such as in addition or something

```java
static int fibonacci(int n) {
    if (n < 2) { // base case where function stops
        return n;
    }

    //here recursive function call is doing + with future recursion calls
    // and also it does depend on them for completion of function and answer
    return fibonacci(n - 1) + fibonacci(n - 2);
}
```

### Recursive Tree for Fibonacci Series

![Fibonacci_Recursive_Tree_Linear_Recurrence](../Assets/Fibonacci_Recursive_Tree_Linear_Recurrence.png)

## Types of Recurrence relations in Recursion

1. **Linear Recurrence Relation**
   where future function calls called on same arguments but just linearly we increase or decrease

* **for example**  
  `fibonacci(N) = fibonacci(N-1) + fibonacci(N-2) <- (n-1) or (n-2) shows it's linear`

2. **Divide & Conquer Recurrence Relation**
   In this type of Recurrence relation we divide the array exponentially or multiply it exponentially to get our answer

`BinarySearch(N) = O(1) + BinarySearch(N/2) <- Here O(1) means it compares with target and arr[mid] is it bigger smaller or equals to it`

## How to Understand a