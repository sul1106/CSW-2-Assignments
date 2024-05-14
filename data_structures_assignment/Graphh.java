package data_structures_assignment;

import java.util.*;

class Graphh {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adjList; // Adjacency list representation

    // Constructor to initialize the graph with V vertices
    public Graphh(int V) {
        this.V = V;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Method to add an edge between vertices u and v
    public void addEdge(int u, int v) {
        adjList[u].add(v);
    }

    // Method to read a graph and store it in the adjacency list representation
    public void readGraph(Scanner scanner) {
        System.out.print("Enter the number of edges: ");
        int E = scanner.nextInt();
        System.out.println("Enter the edges (u v):");
        for (int i = 0; i < E; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            addEdge(u, v);
        }
    }

    // Depth-first search (DFS) method to traverse the vertices of the graph
    public void DFS(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int neighbor : adjList[v]) {
            if (!visited[neighbor]) {
                DFS(neighbor, visited);
            }
        }
    }

    // Method to perform DFS traversal of the graph
    public void performDFS() {
        boolean[] visited = new boolean[V];
        System.out.println("Depth-First Search (DFS):");
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                DFS(i, visited);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();

        Graphh graph = new Graphh(V);
        graph.readGraph(scanner);
        graph.performDFS();

        scanner.close();
    }
}
