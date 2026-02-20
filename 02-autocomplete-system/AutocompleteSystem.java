import java.util.*;

// Online Java Compiler compatible version
public class Main {

    // Trie Node
    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEndOfWord = false;
    }

    // Trie Class
    static class Trie {

        TrieNode root;

        Trie() {
            root = new TrieNode();
        }

        // Insert word into Trie
        public void insert(String word) {

            TrieNode current = root;

            for (char c : word.toCharArray()) {

                if (!current.children.containsKey(c)) {
                    current.children.put(c, new TrieNode());
                }

                current = current.children.get(c);
            }

            current.isEndOfWord = true;
        }

        // Autocomplete function
        public List<String> autocomplete(String prefix) {

            List<String> results = new ArrayList<>();

            TrieNode current = root;

            // Move to prefix node
            for (char c : prefix.toCharArray()) {

                if (!current.children.containsKey(c)) {
                    return results;
                }

                current = current.children.get(c);
            }

            // Find all words using DFS
            dfs(current, prefix, results);

            return results;
        }

        // DFS function
        private void dfs(TrieNode node, String word, List<String> results) {

            if (node.isEndOfWord) {
                results.add(word);
            }

            for (char c : node.children.keySet()) {
                dfs(node.children.get(c), word + c, results);
            }
        }
    }

    // Main function (entry point)
    public static void main(String[] args) {

        Trie trie = new Trie();

        // Insert sample words
        trie.insert("apple");
        trie.insert("app");
        trie.insert("application");
        trie.insert("apt");
        trie.insert("banana");
        trie.insert("bat");
        trie.insert("ball");

        // Prefix to search
        String prefix = "ap";

        // Get suggestions
        List<String> suggestions = trie.autocomplete(prefix);

        // Print output
        System.out.println("Suggestions for prefix \"" + prefix + "\":");

        for (String word : suggestions) {
            System.out.println(word);
        }
    }
}