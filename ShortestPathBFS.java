package module14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathBFS {

    int vertices;
    ArrayList<ArrayList<Integer>> adjList;

    ShortestPathBFS(int v) {
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

    void shortestPath(int start) {
        int[] distance = new int[vertices];
        int[] parent = new int[vertices];
        Arrays.fill(distance, -1);

        Queue<Integer> queue = new LinkedList<>();

        distance[start] = 0;
        parent[start] = -1;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int neighbor : adjList.get(node)) {
                if (distance[neighbor] == -1) {
                    distance[neighbor] = distance[node] + 1;
                    parent[neighbor] = node;
                    queue.add(neighbor);
                }
            }
        }

        // Print shortest distances
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < vertices; i++) {
            System.out.println(i + "\t" + distance[i]);
        }
    }

    public static void main(String[] args) {
        ShortestPathBFS g = new ShortestPathBFS(6);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 5);

        g.shortestPath(0);
    }
}
