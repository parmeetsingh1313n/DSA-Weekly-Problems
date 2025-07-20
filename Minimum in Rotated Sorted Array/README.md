# Minimum in Rotated Sorted Array

## 📝 Problem Overview

We are given an array of distinct integers that was originally sorted in increasing order but then rotated some number of times. The task is to find the **smallest element** in the array.

---

## 🔍 Understanding the Problem

Imagine a sorted array like `[1, 2, 3, 4, 5]`. If we rotate it, say twice, it becomes `[4, 5, 1, 2, 3]`. It’s still made up of two sorted parts. The goal is to find the **point where the rotation happened**, as that gives us the minimum.

---

## 📌 First Thought (Simple Method)

At first, the basic idea that came to mind was to check every element and keep track of the minimum one.

- This would work fine.
- But it takes **O(N)** time, and we’re not really using the fact that the array is mostly sorted.

---

## ⚡ Better Approach (Binary Search)

To make this more efficient, I thought about how **Binary Search** works — since the array is partly sorted, it can help us reduce the number of checks.

### Key Observations:

- In every rotated sorted array, **one half is always sorted**.
- The **minimum value lies at the point where the sorting breaks**.

### How I approached it:

1. I started with two pointers: `low` and `high`.
2. In each step, I found the middle element.
3. I checked which half of the array is sorted:
   - If the **left part** is sorted, then the **minimum** must be on the **right side**.
   - If the **right part** is sorted, the minimum could be the middle element or even on the left.
4. I kept narrowing down the search range, always updating the minimum whenever I found a smaller value.

---

## 📦 Why It Works

The binary search logic helps in cutting down the search space quickly. By checking which side is sorted and comparing values smartly, we can find the minimum without checking all elements.

---

## 📊 Time & Space Complexity

| Approach      | Time       | Space      |
|---------------|------------|------------|
| Brute Force   | O(N)       | O(1)       |
| Binary Search | O(log N)   | O(1)       |

---

## 🧠 Summary

This problem became easier once I realized that the rotation splits the array into two sorted parts. By applying Binary Search smartly, I could find the minimum in log time instead of going through the whole array.

