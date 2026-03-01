# 📱 Java String Revision

### 1. The Big Idea: Immutability

* Strings are **Objects**, not primitives.
* They are **Immutable** (cannot be changed).
* **Array vs String:** * Changing an Array in a function changes the original.
    * Changing a String creates a NEW object.

---

### 2. Memory (The Pool)

Java uses the **String Constant Pool** to save space.

* `String s = "Hi"` -> Uses the Pool (Efficient).
* `String s = new String("Hi")` -> Creates a new object in the Heap (Wastes memory).

---

### 3. Quick Comparison

| Feature     | char[]  | String    |
|:------------|:--------|:----------|
| Changeable? | Yes     | **No**    |
| Memory      | Heap    | Pool/Heap |
| Length      | .length | .length() |

---

### 4. Comparison Rule

* **`==`**: Checks if they are the SAME object in memory.
* **`.equals()`**: Checks if the TEXT is the same.
* **Rule:** Always use `.equals()`.

---

### 5. Must-Know Methods

* `charAt(i)` : Get char at index.
* `substring(s, e)` : Get a slice.
* `trim()` : Remove spaces.
* `contains()` : Check for a word.
* `toCharArray()` : Turn String into an Array.

---

### 🔄 Update Logic: Why they differ

#### 🟦 Arrays (Pass-by-Reference & Mutable)

When you modify an array element:

1. No new object is created.
2. The data at the existing memory address is overwritten.
3. All variables pointing to that address see the change.

#### 🟪 Strings (Immutable & Re-pointing)

When you "modify" a string:

1. The original object remains UNCHANGED.
2. A new String object is created in the Heap/Pool.
3. The variable is updated to hold the address of the NEW object.
4. Other variables pointing to the old object are unaffected.

### ⚡ Performance Tip

Using `+` in a loop is slow. Use **`StringBuilder`** instead because it is mutable and much faster on memory.

# 📱 Java Memory & Strings: Quick Ref

### 🏗️ Memory Visualization (Stack vs. Heap)

When you create variables and objects, Java splits memory like this:

```text
STACK (Fast)             HEAP (Large)
[ Local Variables ]     [ Objects & Pool ]
|                 |     |                |
| str1 -----------|---->| "Hello" <--- [String Pool]
| arr1 -----------|---->| [1, 2, 3]      |
|                 |     |                |