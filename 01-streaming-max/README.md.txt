# Streaming Max Analytics

## Problem

Given a stream of latency values and a window size K, find the maximum latency in every sliding window.

Example:

Input:
[5, 3, 8, 2, 7, 9, 1]
K = 3

Output:
[8, 8, 8, 9, 9]

---

## Approach

This solution uses a Monotonic Deque to efficiently track the maximum value in each window.

The deque stores indices of useful elements in decreasing order of their values.

The front of the deque always contains the maximum element of the current window.

---

## Complexity

Time Complexity: O(N)

Space Complexity: O(K)

---

## Concepts Used

- Sliding Window Technique
- Deque
- Monotonic Queue

---

## Real-world Applications

- Server latency monitoring
- Real-time analytics systems
- Performance monitoring dashboards