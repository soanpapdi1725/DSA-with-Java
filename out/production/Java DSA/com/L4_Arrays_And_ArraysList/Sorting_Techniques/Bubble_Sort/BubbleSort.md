# 🫧 Bubble Sort

Bubble Sort is a stable, in-place sorting algorithm that works by repeatedly swapping adjacent elements if they are in
the wrong order.



---

## ⚙️ How it Works

The algorithm "bubbles" the largest element to the end of the array in each pass.

**Input:** `[5, 4, 3, 2, 1]`

**First Pass Walkthrough:**

* (5, 4) → Swap → `[4, 5, 3, 2, 1]`
* (5, 3) → Swap → `[4, 3, 5, 2, 1]`
* (5, 2) → Swap → `[4, 3, 2, 5, 1]`
* (5, 1) → Swap → `[4, 3, 2, 1, 5]` *(5 is now sorted)*

---

## 📊 Complexity Analysis

| Case  | Time Complexity      | Condition               |
|:------|:---------------------|:------------------------|
| Best  | **O(n)**             | Array is already sorted |
| Worst | **O(n<sup>2</sup>)** | Array is reverse sorted |
| Space | **O(1)**             | No extra memory used    |

---

## 🧮 Derivation of Worst-Case Complexity

To find the complexity, we count the comparisons in the worst case (reverse order).

### 1. Counting Comparisons

For an array of size **n**:

* Pass 1: (n-1) comparisons
* Pass 2: (n-2) comparisons
* Pass 3: (n-3) comparisons
* ...
* Last Pass: 1 comparison

### 2. The Math

Total Comparisons (S) = (n-1) + (n-2) + ... + 1

**Sum Formula:** S = [n * (n - 1)] / 2  
**Expanded:** S = (n<sup>2</sup> - n) / 2

In Big O notation, we ignore constants and lower terms:
**Worst Case = O(n<sup>2</sup>)**

### 📝 Worked Example: Why n = 5 results in 10 Comparisons

In the worst case (e.g., `[5, 4, 3, 2, 1]`), we calculate the total operations by summing the comparisons made in each
pass.

**The Step-by-Step Count:**

* **Pass 1:** 4 comparisons (to move the 1st largest element)
* **Pass 2:** 3 comparisons (to move the 2nd largest element)
* **Pass 3:** 2 comparisons (to move the 3rd largest element)
* **Pass 4:** 1 comparison (to move the 4th largest element)
* **Pass 5:** 0 comparisons (the final element is already in place)

**Summing them up:**
4 + 3 + 2 + 1 = **10 Total Comparisons**

#### 📉 The Quadratic Growth (O(n²))

To see the "Quadratic" effect, watch what happens when we double the input size:

| Input Size (n) | Calculation [n * (n-1) / 2] | Total Comparisons |
|:---------------|:----------------------------|:------------------|
| **n = 5**      | (5 × 4) / 2                 | **10**            |
| **n = 10**     | (10 × 9) / 2                | **45**            |

****~~~~**Observation:** When the array size **doubled** (5 to 10), the work increased **4.5 times** (10 to 45). This "
four-fold" increase is the hallmark of **n<sup>2</sup>** complexity. If the array were 1,000 elements, you would be
doing nearly **500,000** comparisons!****~~~~
---

## ⚖️ Stability

Bubble Sort is **Stable**. Equal elements keep their original relative order.

* **Input:** `[ 5(Red), 3, 5(Green) ]`
* **Output:** `[ 3, 5(Red), 5(Green) ]`
* Because we only swap if `arr[j] > arr[j+1]`, the "Red 5" never jumps over the "Green 5".

---

## 💻 Java Implementation (Optimized)

```java
public class BubbleSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // n - i - 1: avoids checking already sorted end elements
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped, array is sorted!
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] data = {5, 4, 3, 2, 1};
        sort(data);
        for (int num : data) System.out.print(num + " ");
    }
}