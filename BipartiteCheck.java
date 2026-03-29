package module14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteCheck {

    int vertices;
    ArrayList<ArrayList<Integer>> adjList;

    BipartiteCheck(int v) {
        vertices = v;
        adjList = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u); // undirected graph
    }

    boolean isBipartite() {
        int[] color = new int[vertices];
        Arrays.fill(color, -1); // -1 means uncolored

        for (int i = 0; i < vertices; i++) {
            if (color[i] == -1) {
                if (!bfsCheck(i, color))
                    return false;
            }
        }
        return true;
    }

    boolean bfsCheck(int start, int[] color) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        color[start] = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int neighbor : adjList.get(node)) {
                if (color[neighbor] == -1) {
                    color[neighbor] = 1 - color[node];
                    queue.add(neighbor);
                } else if (color[neighbor] == color[node]) {
                    return false; // conflict
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        BipartiteCheck g = new BipartiteCheck(4);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);

        if (g.isBipartite())
            System.out.println("Graph is Bipartite");
        else
            System.out.println("Graph is Not Bipartite");
    }
}