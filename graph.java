import java.io.*; 
import java.util.*; 
class Graph 
{ 
    private int V;   
    private LinkedList<Integer> adj[]; 
  
    Graph(int v) 
    { 
        V = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 
  
    void addEdge(int v,int w) 
    { 
        adj[v].add(w); 
    } 
  
    
    void BFS(int s) 
    { 
        
        boolean visited[] = new boolean[V]; 
  
        
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
  
       
        visited[s]=true; 
        queue.add(s); 
  
        while (queue.size() != 0) 
        { 
            
            s = queue.poll(); 
            System.out.print(s+" "); 
            Iterator<Integer> i = adj[s].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
        } 
    } 

    void DFSUtil(int v, boolean visited[])
    {
        
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) 
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
    void DFS(int v)
    {
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }
} 
public class graph
{
    public static void main(String args[]) 
    { 
        Graph g = new Graph(4); 
  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        g.BFS(2); 
        g.DFS(2);
    } 
}