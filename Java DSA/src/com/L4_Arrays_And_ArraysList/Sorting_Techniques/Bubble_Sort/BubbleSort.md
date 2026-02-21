# 🫧 Understanding Bubble Sort

Bubble Sort is a comparison-based sorting algorithm where each pair of adjacent elements is compared and the elements
are swapped if they are not in order.



---

## ⚙️ How it Works

The algorithm "bubbles" the largest element to its correct position at the end of the array in each pass.

1. Start at the beginning of the array.
2. Compare the first two elements. If the first is greater than the second, **swap** them.
3. Move to the next pair and repeat until the end of the array.
4. Repeat the process for the remaining unsorted portion.

### Example Walkthrough

**Input:** `[5, 4, 3, 2, 1]`

**First Pass:**

* (5, 4) → Swap → `[4, 5, 3, 2, 1]`
* (5, 3) → Swap → `[4, 3, 5, 2, 1]`
* (5, 2) → Swap → `[4, 3, 2, 5, 1]`
* (5, 1) → Swap → `[4, 3, 2, 1, 5]`  *(5 is now in place)*

---

## 📊 Complexity Analysis

| Case                 | Time Complexity | Condition                                       |
|:---------------------|:----------------|:------------------------------------------------|
| **Best Case**        | $O(n)$          | Array is already sorted (using optimized flag). |
| **Worst Case**       | $O(n^2)$        | Array is sorted in reverse order.               |
| **Average Case**     | $O(n^2)$        | Random distribution of elements.                |
| **Space Complexity** | $O(1)$          | In-place sorting; no extra memory needed.       |

---

## 🧮 Derivation of Worst-Case Time Complexity

To find the complexity, we count the total number of **comparisons** the algorithm performs in the worst case (when the
array is sorted in reverse order).

### 1. Counting the Comparisons

In Bubble Sort, for an array of size $n$:

* In **Pass 1**, we perform $(n-1)$ comparisons.
* In **Pass 2**, we perform $(n-2)$ comparisons.
* In **Pass 3**, we perform $(n-3)$ comparisons.
* ...
* In the **Last Pass**, we perform $1$ comparison.

### 2. Summing the Total

The total number of comparisons ($S$) is the sum of the first $(n-1)$ natural numbers:

$$S = (n-1) + (n-2) + (n-3) + ... + 2 + 1$$

Using the formula for the sum of the first $k$ natural numbers, where $\sum_{i=1}^{k} i = \frac{k(k+1)}{2}$, we
substitute $k = n-1$:

$$S = \frac{(n-1)((n-1) + 1)}{2}$$
$$S = \frac{(n-1)(n)}{2}$$
$$S = \frac{n^2 - n}{2}$$

### 3. Big O Notation

In Big O notation, we ignore lower-order terms (like $n$) and constant coefficients (like $1/2$):

* $\frac{1}{2}n^2 - \frac{1}{2}n \approx n^2$

Therefore, the **Worst-Case Time Complexity** is:
$$\text{Worst Case} = O(n^2)$$

> **Note:** Since the number of swaps in the worst case is also proportional to the number of comparisons, the overall
> complexity remains quadratic.

### 📝 Worked Example: $n = 5$

Let’s calculate the total number of comparisons for an array of size **5** in the worst case (reverse sorted).

| Pass Number | Unsorted Elements | Comparisons Made | Logic                                |
|:------------|:------------------|:-----------------|:-------------------------------------|
| **Pass 1**  | 5                 | **4**            | (Compare indices 0-1, 1-2, 2-3, 3-4) |
| **Pass 2**  | 4                 | **3**            | (Compare indices 0-1, 1-2, 2-3)      |
| **Pass 3**  | 3                 | **2**            | (Compare indices 0-1, 1-2)           |
| **Pass 4**  | 2                 | **1**            | (Compare index 0-1)                  |
| **Pass 5**  | 1                 | **0**            | (Last element is already sorted)     |

**Total Comparisons ($S$):**
$$S = 4 + 3 + 2 + 1 = 10$$

#### Verification using the Formula:

Using our derived formula $S = \frac{n(n-1)}{2}$:
$$S = \frac{5(5-1)}{2}$$
$$S = \frac{5 \times 4}{2}$$
$$S = \frac{20}{2} = 10$$

### 📉 Why this is $O(n^2)$

If we doubled the array size to **$n = 10$**:
$$S = \frac{10(9)}{2} = 45$$

Notice that when $n$ doubled (from 5 to 10), the number of operations didn't just double—it increased **more than 4
times** ($10 \rightarrow 45$). This quadratic growth is exactly what $n^2$ represents!

## ⚖️ Stability: Why it Matters

Bubble Sort is a **Stable Algorithm**.

**Stability** means that elements with equal values maintain their relative order from the original input.

### Visualizing Stability

Imagine an array with colored markers:
`[ 5🔴, 3🔵, 5🟢, 2🟡 ]`

* **Stable Result:** `[ 2🟡, 3🔵, 5🔴, 5🟢 ]` (Red 5 stays before Green 5)
* **Unstable Result:** `[ 2🟡, 3🔵, 5🟢, 5🔴 ]` (The order of 5s is swapped)

Because Bubble Sort only swaps if $arr[j] > arr[j+1]$ (not equal), it naturally preserves the original order of
identical elements.

---

## 💻 Java Implementation (Optimized)

The following implementation includes a `swapped` boolean to ensure **O(N)** time complexity if the array is already
sorted.

```java
public class BubbleSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Inner loop for comparisons
            // n - i - 1 ensures we don't check already sorted elements
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped, the array is sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] data = {5, 4, 3, 2, 1};
        sort(data);
        
        // Print sorted array
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}