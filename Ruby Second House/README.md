# Ruby Second House

### Problem Description

You're managing the painting of a long row of houses. Each house must be painted using one of several available colors. However, no two adjacent houses can be painted the same color. Each color choice has a specific cost.

You are given a matrix where `costs[i][j]` indicates the cost of painting the `i-th` house with the `j-th` color.

Your task is to paint all houses such that:
- No two adjacent houses have the same color.
- The overall painting cost is minimized.

---

### Input Format

- First line: Two integers `n` and `k` — number of houses and number of colors.
- Next `n` lines: Each line contains `k` space-separated integers, where each number represents the cost of painting a house with a particular color.

---

### Output Format

- A single integer — the minimum total cost of painting all houses following the rules.

---

### Constraints

- `1 <= n <= 100`
- `2 <= k <= 20`
- `1 <= costs[i][j] <= 20`

---

### Example

#### Input:
2 3
1 5 3
2 9 4

#### Output:
5


#### Explanation:

There are two optimal ways:
- Paint house 0 with color 0 (cost = 1) and house 1 with color 2 (cost = 4). Total = 1 + 4 = 5  
- Paint house 0 with color 2 (cost = 3) and house 1 with color 0 (cost = 2). Total = 3 + 2 = 5  

---

### Approach Summary

The logic optimizes cost by keeping track of the lowest and second lowest painting costs from the previous row. For each house, it decides the best color to use while ensuring it differs from the previous house's color.

---

### Time & Space Complexity

- **Time Complexity:** O(n × k), where `n` is the number of houses and `k` is the number of colors.
- **Space Complexity:** O(1), as we update the cost matrix in place and avoid using any extra space.

---

### Test Cases Covered
The code includes a wide range of test cases including:
- Minimal input size
- Equal costs
- Large difference between color costs
- Multiple combinations with the same minimum cost
- Edge cases with only two colors

