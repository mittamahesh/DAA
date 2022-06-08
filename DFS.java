import java.io.*;
import java.util.*;
 

class DfsGraph {
    private int V;                             
 
    private LinkedList<Integer> adj[];              
 
    public DfsGraph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
        {
          adj[i] = new LinkedList<Integer>();
    	}
    }
 
    void addEdge(int v, int w)
    {
        adj[v].add(w);                            
    }
 

    void DFSUtil(int vertex, boolean nodes[])
    {

        nodes[vertex] = true;                         
        System.out.print(vertex + " ");
        int a = 0;
 
        for (int i = 0; i < adj[vertex].size(); i++)  
            {
                a = adj[vertex].get(i);
                if (!nodes[a])                   
                {
                    DFSUtil(a, nodes);
                }
            }  
    }

    void DFS(int v)
    {
        boolean already[] = new boolean[V];             
        DFSUtil(v, already);
    }
 
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of vertices: ");
        int n=sc.nextInt();
        
        DfsGraph g = new DfsGraph(n);
        System.out.println("Enter the no of edges: ");
        int e=sc.nextInt();
        for(int i=0;i<e;i++)
        {
        	System.out.println("Enter the vertex1 and vertex 2 :");
        	int v1 =sc.nextInt();
        	int v2 =sc.nextInt();
        	g.addEdge(v1, v2);
        } 
        System.out.println("Following is Depth First Traversal: ");
 
        g.DFS(0);
    }
}
