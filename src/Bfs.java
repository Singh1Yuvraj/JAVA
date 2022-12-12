
import java.util.*;
    public class Bfs
    {
        private int node;       
        private LinkedList<Integer> arr[];     
        private Queue<Integer> Q;           
        Bfs(int V)
        {
            node = V;
            arr = new LinkedList[node];
            for (int i=0; i<V; i++)
            {
                arr[i] = new LinkedList<>();
            }
            Q = new LinkedList<Integer>();
        }
        void Edge(int A,int w)
        {
            arr[A].add(w);
        }
       
        void Bfstraversal(int n)
        {
            boolean nodes[] = new boolean[node];       
            int a = 0;
            nodes[n]=true;
            Q.add(n);       
            while (Q.size() != 0)
            {
                n = Q.poll();       
                System.out.print(n+" ");    
                for (int i = 0; i < arr[n].size(); i++)  
                {
                    a = arr[n].get(i);
                    if (!nodes[a])      
                    {
                        nodes[a] = true;
                        Q.add(a);
                    }
                }
            }
        }
        public static void main(String args[])
        {
            Bfs graph = new Bfs(8);
            graph.Edge(0, 1);
            graph.Edge(0, 2);
            graph.Edge(1, 2);
            graph.Edge(1, 3);
            graph.Edge(2, 3);
            graph.Edge(2, 4);
            graph.Edge(3, 4);
            graph.Edge(3, 5);
            graph.Edge(4, 6);
            graph.Edge(5, 6);
            graph.Edge(5, 7);
            graph.Edge(6, 7);
            System.out.println("BFS for the graph is:");
            graph.Bfstraversal(2);
        }
    }

