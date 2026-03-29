package module14;

import java.util.ArrayList;

public class CountGraph {

    int vertices;
    ArrayList<ArrayList<Integer>> adjList;

    CountGraph(int v) {
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

    void count() {
        int edgeCount = 0;

        for (int i = 0; i < vertices; i++) {
            edgeCount += adjList.get(i).size();
        }

        edgeCount = edgeCount / 2; // each edge counted twice

        System.out.println("Number of vertices: " + vertices);
        System.out.println("Number of edges: " + edgeCount);
    }

    public static void main(String[] args) {
        CountGraph g = new CountGraph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);

        g.count();
    }
}
