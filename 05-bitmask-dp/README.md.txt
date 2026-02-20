# Optimal Resource Allocation (Bitmask Dynamic Programming)

## Problem

Assign N workers to N tasks such that total cost is minimized.

Each worker can perform only one task.

Example:

Cost Matrix:
[9,2,7]
[6,4,3]
[5,8,1]

Output:
Minimum cost assignment

---

## Approach

Uses Bitmask Dynamic Programming.

Each bit represents whether a task is assigned.

State represents current assignment.

DP stores minimum cost for each state.

---

## Complexity

Time Complexity: O(2^N × N²)

Space Complexity: O(2^N)

---

## Concepts Used

- Dynamic Programming
- Bitmasking
- State Compression

---

## Real-world Applications

- Task scheduling
- Resource allocation
- Optimization systems