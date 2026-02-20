# Global Autocomplete System

## Problem

Design an autocomplete system that stores words and returns suggestions based on a given prefix.

Example:

Words:
apple, app, application, apt

Prefix:
ap

Output:
app, apple, application, apt

---

## Approach

This solution uses a Trie (Prefix Tree).

Each node represents a character.

Words sharing the same prefix share the same path in the trie.

DFS is used to retrieve all words matching a prefix.

---

## Complexity

Insertion Time: O(L)

Search Time: O(L)

Where L is the length of the word or prefix.

---

## Concepts Used

- Trie Data Structure
- Depth First Search (DFS)
- Prefix Matching

---

## Real-world Applications

- Google Search autocomplete
- Code editors (IntelliSense)
- Mobile keyboard suggestions