//Q10. Write a Java program to traverse a graph using breadth-first search (BFS) and provide the final output of the code. (Use the ArrayDeque collection.) 
package data_structures_assignment;
//importing package
import java.util.*;
public class q10
{
    static class Graph 
    {
        int Vertex;
        LinkedList<Integer>[] adjList;
        public Graph(int V)
        {
         this.Vertex = V;
         adjList = new LinkedList[Vertex];
         for (int i = 0; i < Vertex; ++i) 
         adjList[i] = new LinkedList<>();
         }
        public void addEdge(int source, int destination) 
        {
            adjList[source].add(destination);
        }
        public void BFS(int startNode) 
        {
            boolean[] visited = new boolean[Vertex];
            ArrayDeque<Integer> queue = new ArrayDeque<>();
            visited[startNode] = true;
            queue.add(startNode);
            while (!queue.isEmpty()) 
            {
                int curr = queue.poll();
                System.out.print(curr + " ");
                for (int n:adjList[curr]) 
                {
                    if(!visited[n]) 
                    {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        // Adding new edges
        graph.addEdge(0, 4);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(1, 5);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);

        // Perform BFS from vertex 0
        System.out.println("BFS Traversal:");
        graph.BFS(0);
    }
}
