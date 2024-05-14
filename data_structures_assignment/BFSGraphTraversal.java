package data_structures_assignment;

import java.util.*;

public class BFSGraphTraversal {
    static class Graph {
        int V;
        LinkedList<Integer>[] adjList;

        public Graph(int V) {
            this.V = V;
            adjList = new LinkedList[V];
            for (int i = 0; i < V; ++i) {
                adjList[i] = new LinkedList<>();
            }
        }

        public void addEdge(int src, int dest) {
            adjList[src].add(dest);
        }

        public void BFS(int startNode) {
            boolean[] visited = new boolean[V];
            ArrayDeque<Integer> queue = new ArrayDeque<>();

            visited[startNode] = true;
            queue.add(startNode);

            while (!queue.isEmpty()) {
                int current = queue.poll();
                System.out.print(current + " ");

                for (int neighbor : adjList[current]) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        // Perform BFS from vertex 0
        System.out.println("BFS Traversal:");
        graph.BFS(0);
    }
}
