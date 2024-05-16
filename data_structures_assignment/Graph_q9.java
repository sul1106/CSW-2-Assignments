package data_structures_assignment;

import java.util.*;

class Graph_q9 
{
    // Number of vertices
    public int Vertex; 
    public LinkedList<Integer>[] adjList; // Adjacency list representation
   // Constructor 
    public Graph_q9(int Vertex)
     {
        this.Vertex = Vertex;
        adjList = new LinkedList[Vertex];
        for (int i = 0; i<Vertex; i++) 
            adjList[i]=new LinkedList<>();
     }
    // Method to add an edge 
    public void addEdge(int u, int v) 
    {
        adjList[u].add(v);
    }
    // Method to read a graph and store it in the adjacency list representation
    public void readGraph(Scanner sc) 
    {
        System.out.print("Enter the number of edges: ");
        int e = sc.nextInt();
        System.out.println("Enter the edges (u v):");
        for (int i = 0; i < e; i++) 
        {
            int u=sc.nextInt();
            int v=sc.nextInt();
            addEdge(u,v);
        }
    }
     // Depth-first search (DFS)
    public void DFS(int v,boolean[] visited)
     {
        visited[v] = true;
        System.out.print(v + " ");
        for (int neighbor : adjList[v]) 
        {
            if (!visited[neighbor])
                DFS(neighbor, visited);
        }
    }
 // Method to perform DFS traversal of the graph
    public void performDFS()
    {
        boolean[] visited = new boolean[Vertex];
        System.out.println("Depth-First Search:");
        for (int i = 0; i < Vertex; i++) 
        {
            if (!visited[i]) 
                DFS(i, visited);
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int v= sc.nextInt();
        Graph_q9 graph = new Graph_q9(v);
        graph.readGraph(sc);
        graph.performDFS();
    }
}
