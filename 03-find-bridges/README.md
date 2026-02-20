# Network Vulnerability Detection (Find Bridges)

## Problem

Given a communication network represented as a graph, identify all critical connections (bridges).

A bridge is an edge that, if removed, disconnects the network.

Example:

Connections:
0-1, 1-2, 2-0, 1-3

Output:
[1,3]

---

## Approach

This solution uses Tarjan's Algorithm with Depth First Search.

Each node has:

- Discovery time
- Lowest reachable time

If low[v] > discovery[u], then edge (u,v) is a bridge.

---

## Complexity

Time Complexity: O(V + E)

Space Complexity: O(V)

---

## Concepts Used

- Graph Representation
- Depth First Search
- Tarjan's Algorithm

---

## Real-world Applications

- Network failure detection
- Infrastructure vulnerability analysis
- Communication systems