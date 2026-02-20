import java.util.*;

public class Main {

    static int time = 0;

    static List<List<Integer>> findBridges(int n, List<List<Integer>> connections) {

        List<List<Integer>> result = new ArrayList<>();

        @SuppressWarnings("unchecked")
        List<Integer>[] graph = (List<Integer>[]) new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (List<Integer> conn : connections) {
            graph[conn.get(0)].add(conn.get(1));
            graph[conn.get(1)].add(conn.get(0));
        }

        int[] disc = new int[n];
        int[] low = new int[n];
        boolean[] visited = new boolean[n];

        dfs(0, -1, graph, disc, low, visited, result);

        return result;
    }

    static void dfs(int u, int parent,
                    List<Integer>[] graph,
                    int[] disc,
                    int[] low,
                    boolean[] visited,
                    List<List<Integer>> result) {

        visited[u] = true;

        disc[u] = low[u] = ++time;

        for (int v : graph[u]) {

            if (v == parent)
                continue;

            if (!visited[v]) {

                dfs(v, u, graph, disc, low, visited, result);

                low[u] = Math.min(low[u], low[v]);

                if (low[v] > disc[u])
                    result.add(Arrays.asList(u, v));
            }
            else {
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }

    public static void main(String[] args) {

        List<List<Integer>> connections = new ArrayList<>();

        connections.add(Arrays.asList(0,1));
        connections.add(Arrays.asList(1,2));
        connections.add(Arrays.asList(2,0));
        connections.add(Arrays.asList(1,3));

        System.out.println(findBridges(4, connections));
    }
}