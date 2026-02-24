# 🎯 Selection Sort: Search and Place

Selection Sort is a simple comparison-based sorting algorithm. It works by repeatedly finding the appropriate element (
smallest or largest) from the unsorted part and putting it at the beginning (or end).

---

## ⚙️ How it Works

Selection Sort divides the array into two parts:

1. **Sorted Part:** Built up from left to right (or right to left).
2. **Unsorted Part:** The remaining elements to be searched.

### Two Strategies:

* **Strategy A:** Find the **Smallest** element and swap it with the first unsorted position.
* **Strategy B:** Find the **Greatest** element and swap it with the last unsorted position.

---

## 🏃 Walkthrough: "Greatest to Last" Strategy

**Input Array:** `[4, 5, 1, 2, 3]`  
*Goal: Find the max element in the unsorted range and swap it with the last index of that range.*

| Pass  | Unsorted Range  | Max Found | Swap With         | Resulting Array     |
|:------|:----------------|:----------|:------------------|:--------------------|
| **1** | [4, 5, 1, 2, 3] | **5**     | Index 4 (Value 3) | [4, 3, 1, 2, **5**] |
| **2** | [4, 3, 1, 2]    | **4**     | Index 3 (Value 2) | [2, 3, 1, **4, 5**] |
| **3** | [2, 3, 1]       | **3**     | Index 2 (Value 1) | [2, 1, **3, 4, 5**] |
| **4** | [2, 1]          | **2**     | Index 1 (Value 1) | [**1, 2, 3, 4, 5**] |

---

## 📊 Complexity Analysis

| Case           | Time Complexity      | Reason                                                                   |
|:---------------|:---------------------|:-------------------------------------------------------------------------|
| **Best Case**  | **O(n<sup>2</sup>)** | Even if sorted, it must scan the unsorted part to "confirm" the minimum. |
| **Worst Case** | **O(n<sup>2</sup>)** | Occurs when the array is reverse sorted.                                 |
| **Space**      | **O(1)**             | In-place algorithm; uses no extra memory.                                |

### 🧮 Number of Comparisons

In each iteration, the number of comparisons is **(n - 1 - i)**.

* **Total Comparisons:** (n-1) + (n-2) + ... + 1 = **n(n-1) / 2**
* This is why the complexity is always **O(n<sup>2</sup>)**, regardless of the initial order.

---

## ⚖️ Stability: Why is it Unstable?

Selection Sort is **Unstable**. This is because long-distance swaps can jump an element over an identical one, ruining
their original relative order.

**Example:** `[ 5🔴, 5🔵, 1🟡 ]`

1. The algorithm finds the smallest element: **1🟡**.
2. It swaps **1🟡** with the first element **5🔴**.
3. **Result:** `[ 1🟡, 5🔵, 5🔴 ]`
4. **Notice:** The Blue 5 is now *before* the Red 5. The order has changed!

---

## 🚀 Key Features & Use Cases

* **Minimal Swaps:** It performs a maximum of **O(n)** swaps. This is useful if writing to memory is very expensive (
  like Flash memory).
* **Unstable:** It does not maintain the relative order of equal elements.
* **In-Place:** It requires no additional storage space.
* **Simplicity:** Very easy to implement, but inefficient for large datasets.

---

## 💻 Java Implementation (Greatest to Last)

```java
static void selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) { // will run till (length - 1)
            int last = n - 1 - i; // last index at every iteration so that we Can swap
            int max = getMax(arr, 0, last); //will get the max element in the array one by one
            swapNums(arr, max, last);
   }
}

static void swapNums(int[] arr, int maxIndex, int lastIndex) {
    int temp = arr[maxIndex];
    arr[maxIndex] = arr[lastIndex];
    arr[lastIndex] = temp;
}

static int getMax(int[] arr, int start, int last) {
   int max = 0;
   for (int j = 0; j <= last; j++) {
       if (arr[max] < arr[j]) {
             max = j;
       }
   }
   return max;
}