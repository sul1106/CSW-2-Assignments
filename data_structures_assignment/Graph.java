package data_structures_assignment;

import java.util.*;

public class Graph {
    private int V; // Number of vertices
    private int[][] adjMatrix; // Adjacency matrix
    private ArrayList<ArrayList<Integer>> adjList; // Adjacency list
    
    // Constructor to initialize the graph with V vertices
    public Graph(int V) {
        this.V = V;
        adjMatrix = new int[V][V];
        adjList = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }
    
    // Method to add an edge between vertices u and v
    public void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1; // For undirected graph
        
        adjList.get(u).add(v);
        adjList.get(v).add(u); // For undirected graph
    }
    
    // Method to display the adjacency matrix
    public void displayAdjacencyMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Method to display the adjacency list
    public void displayAdjacencyList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + ": ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // Create a graph with 5 vertices
        Graph graph = new Graph(5);
        
        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        
        // Display adjacency matrix and adjacency list
        graph.displayAdjacencyMatrix();
        graph.displayAdjacencyList();
    }
}

