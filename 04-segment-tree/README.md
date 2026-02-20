# Range Performance Monitor (Segment Tree)

## Problem

Design a system that supports:

- Update(index, value)
- Query maximum value in range (L, R)

Example:

Array:
[1,3,5,7,9,11]

Query(1,4):
Output: 9

---

## Approach

Segment Tree is used for efficient range queries and updates.

Tree nodes store maximum value in a range.

Both update and query operations run in logarithmic time.

---

## Complexity

Build Time: O(N)

Query Time: O(log N)

Update Time: O(log N)

---

## Concepts Used

- Segment Tree
- Divide and Conquer
- Range Queries

---

## Real-world Applications

- Stock market analysis
- Database queries
- Performance monitoring systems