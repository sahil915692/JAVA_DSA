
//  import java.util.*;
/* what if graph 
A graph is a colection of vertices (Nodes )
and Edges (collection between nodes)

Graph can be:
Directed or Undirected 
Weighted or Un weighted
Cuclic or Acyclic 


Graph representation 
two common way to represent a graph 
1.Adjacency list :(Efficient sparse graph)
2. Adjacency Matrix :(Efficient for dense graph)




 (BFS)
 level-by-level traversal
 uses a qu
 best for findimg the shorten path in unweighted graphs 

 (DFS)
 Backtracking 
 uses a stack ( Recursively or manually)
 useful in cyclic dertion , tooplogical sorting and more
 *
    vertices 0->[1,4]  
 1->[0,2]
 2->[1,4]
 3->[4]
 4->[0,2,3]
 */


 //import java.util.*;

// public class Graph {
//     int v; 
//     List<List<Integer>> adjList;
//     // Constructor
//     Graph(int v) {
//         this.v = v;
//         adjList = new LinkedList<>();
//         for (int i = 0; i < v; i++) {
//             adjList.add(new ArrayList<>());
//         }
//     }
//     void addEdges(int u, int v) {
//         adjList.get(u).add(v); 
//         adjList.get(v).add(u); 
//     }
//     void printGraph() {
//         for (int i = 0; i < v; i++) {
//             System.out.print(i + "  ");
//             for (int n : adjList.get(i)) {
//                 System.out.print(n + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Graph g = new Graph(5);
//         g.addEdges(0, 1);
//         g.addEdges(0, 4);
//         g.addEdges(1, 2);
//         g.addEdges(2, 4);
//         g.addEdges(3, 4);
//         System.out.println("Adjacency List: ");
//         g.printGraph();
// }
// }





//BFS Traversal

// public class Graph {
//     int v;
//     List<List<Integer>> adjList;
//     Graph(int v) {
//         this.v = v;
//         adjList = new ArrayList<>(); 
//         for (int i = 0; i < v; i++) {
//             adjList.add(new ArrayList<>());
//         }
//     }

//     void addEdges(int u, int v) {
//         adjList.get(u).add(v); 
//     }

//     void printGraph() {
//         for (int i = 0; i < v; i++) {
//             System.out.print(i + " -> ");
//             for (int n : adjList.get(i)) {
//                 System.out.print(n + " ");
//             }
//             System.out.println();
//         }
//     }

//     void BFStraversal(int start) {
//         boolean visited[] = new boolean[v];
//         Queue<Integer> queue = new LinkedList<>();

//         visited[start] = true;
//         queue.add(start);

//         System.out.println("BFS Traversal:");

//         while (!queue.isEmpty()) {
//             int node = queue.poll();
//             System.out.print(node + " ");

//             for (int neighbor : adjList.get(node)) {
//                 if (!visited[neighbor]) {
//                     visited[neighbor] = true;
//                     queue.add(neighbor);
//                 }
//             }
//         }

//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Graph g = new Graph(5);
//         g.addEdges(0, 1);
//         g.addEdges(0, 4);
//         g.addEdges(1, 2);
//         g.addEdges(2, 4);
//         g.addEdges(3, 4);

//         System.out.println("Adjacency List: ");
//         g.printGraph();

//         g.BFStraversal(0); 
//     }
// }





// public class Graph {
//     int v;
//     List<List<Integer>> adjList;

//     Graph(int v) {
//         this.v = v;
//         adjList = new ArrayList<>();
//         for (int i = 0; i < v; i++) {
//             adjList.add(new ArrayList<>());
//         }
//     }

//     void addEdges(int u, int v) {
//         adjList.get(u).add(v); 
//     }

//     void printGraph() {
//         for (int i = 0; i < v; i++) {
//             System.out.print(i + " -> ");
//             for (int n : adjList.get(i)) {
//                 System.out.print(n + " ");
//             }
//             System.out.println();
//         }
//     }

//     void BFStraversal(int start) {
//         boolean[] visited = new boolean[v];
//         Queue<Integer> queue = new LinkedList<>();

//         visited[start] = true;
//         queue.add(start);

//         System.out.println("BFS Traversal:");
//         while (!queue.isEmpty()) {
//             int node = queue.poll();
//             System.out.print(node + " ");

//             for (int neighbor : adjList.get(node)) {
//                 if (!visited[neighbor]) {
//                     visited[neighbor] = true;
//                     queue.add(neighbor);
//                 }
//             }
//         }
//         System.out.println();
//     }

//     void DFS(int start) {
//         boolean[] visited = new boolean[v];
//         System.out.println("DFS Traversal:");
//         DFSUtil(start, visited);
//         System.out.println();
//     }

//     void DFSUtil(int node, boolean[] visited) {
//         visited[node] = true;
//         System.out.print(node + " ");

//         for (int neighbor : adjList.get(node)) {
//             if (!visited[neighbor]) {
//                 DFSUtil(neighbor, visited);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Graph g = new Graph(5);
//         g.addEdges(0, 1);
//         g.addEdges(0, 4);
//         g.addEdges(1, 2);
//         g.addEdges(2, 4);
//         g.addEdges(3, 4);

//         System.out.println("Adjacency List: ");
//         g.printGraph();

//         g.BFStraversal(0);
//         g.DFS(0);  
//     }
// }

 

    