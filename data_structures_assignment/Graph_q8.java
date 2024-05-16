//Write a program to implement the graph using adjacency matrix representation and adjacency list representation. Create methods to display the adjacency matrix and adjacency list of the graph. 

package data_structures_assignment;
import java.util.*;
public class Graph_q8 
{
    public int vertices;// Number of vertices
    public int[][] adjMatrix;// Adjacency matrix
    public ArrayList<ArrayList<Integer>> adjList;// Adjacency list
    
    // Constructor 
    public Graph_q8(int vertices) 
    {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
        adjList = new ArrayList<>(vertices);
        for(int i = 0;i < vertices;i++)
            adjList.add(new ArrayList<>());
    }
    // Method to add an edge
    public void addEdge(int u,int v) 
    {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1; // For undirected graph
        adjList.get(u).add(v);
        adjList.get(v).add(u); // For undirected graph
    }
     // Method to display the adjacency matrix
    public void displayAdjacencyMatrix() 
    {
        System.out.println("Adjacency Matrix:");
        for(int i=0;i<vertices;i++) 
        {
            for (int j=0;j<vertices;j++) 
            {
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    // Method to display the adjacency list
    public void displayAdjacencyList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++)
         {
            System.out.print("Vertex " + i + ": ");
            for (int neighbor : adjList.get(i))
                System.out.print(neighbor + " ");
             System.out.println();
        }
    }
    public static void main(String[] args)
     {
        Graph_q8 graph = new Graph_q8(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 5);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.displayAdjacencyMatrix();
        graph.displayAdjacencyList();
    }
}

