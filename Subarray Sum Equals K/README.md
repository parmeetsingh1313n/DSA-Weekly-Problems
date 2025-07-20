# ✅ Count of Subarrays with Sum Equal to K

## 📝 Problem Overview

Given an array of integers and a number `k`, we’re supposed to count how many **continuous subarrays** in the array have a total sum equal to `k`.

---

## 🔍 Understanding the Problem

Let’s say we have an array like `[1, 2, 3]` and `k = 3`.

- The subarrays `[1, 2]` and `[3]` both add up to `k = 3`.
- So the answer is `2`.

This problem is about finding **how many such chunks (subarrays)** exist where their sum is exactly equal to `k`.

---

## 📌 First Thought (Brute Force)

Initially, I just thought of checking **all possible subarrays** and calculating their sum.

- This works fine for small inputs.
- But for bigger arrays, it takes too long because it checks every possible combination.

### Why it’s slow:
It tries every start and end index of subarrays and sums the elements in between — which gives us `O(N³)` time.

---

## ⚡ Better Approach (Prefix Sum + Two Loops)

Then I realized I can skip the innermost loop by keeping a running sum.

### How I approached it:

1. I fix a starting index `i`.
2. I keep adding elements from `i` to `j` and update the running sum.
3. If the sum becomes `k`, I increase the count.

Now we’ve reduced the time to `O(N²)` — better, but still not ideal for large inputs.

---

## 🚀 Optimized Approach (Using HashMap and Prefix Sum)

Eventually, I used a **HashMap + Prefix Sum** method to get it done in linear time.

### Key idea:

- Keep a cumulative sum (`prefixSum`) as we move through the array.
- For each element, check if there’s a **prefix sum** that when subtracted from the current sum gives `k`.
- Use a map to remember how many times each prefix sum has occurred.

### Why it works:

If the difference `(current sum - k)` has appeared before, then there’s a subarray ending at the current position that adds up to `k`.

---

## 📦 Why It Works

The prefix sum helps track total sums up to a point, and the HashMap helps find if we’ve seen the "required" sum before — giving us a way to count valid subarrays in constant time per element.

Also, by setting `map[0] = 1` initially, we can correctly count subarrays starting from the very first index.

---

## 📊 Time & Space Complexity

| Approach             | Time     | Space    |
|----------------------|----------|----------|
| Brute Force          | O(N³)    | O(1)     |
| Prefix Sum (2 loops) | O(N²)    | O(1)     |
| HashMap + Prefix Sum | O(N)     | O(N)     |

---

## 🧠 Summary

At first, it looked like a normal subarray problem, but by using prefix sums and maps, I managed to solve it way faster. It was interesting to realize that just tracking the right values with a map could completely avoid checking every subarray manually.
