package module14;

import java.util.ArrayList;

public class CycleDetection {

    int vertices;
    ArrayList<ArrayList<Integer>> adjList;

    CycleDetection(int v) {
        vertices = v;
        adjList = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    boolean dfs(int node, boolean[] visited, int parent) {
        visited[node] = true;

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, visited, node))
                    return true;
            } else if (neighbor != parent) {
                return true; // cycle found
            }
        }
        return false;
    }

    boolean hasCycle() {
        boolean[] visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                if (dfs(i, visited, -1))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CycleDetection g = new CycleDetection(4);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0); // forms a cycle
        g.addEdge(2, 3);

        if (g.hasCycle())
            System.out.println("Cycle detected");
        else
            System.out.println("No cycle");
    }
}