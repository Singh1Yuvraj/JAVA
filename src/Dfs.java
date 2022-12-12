import java.util.*;
public class Dfs {



            private LinkedList<Integer> arr[];
            private boolean visit[];
            Dfs(int N)
            {
                arr = new LinkedList[N];
                visit = new boolean[N];

                for (int i = 0; i < N; i++)
                    arr[i] = new LinkedList<Integer>();
            }



            void dfstraversal(int ver) {
                visit[ver] = true;
                System.out.print(ver + " ");

                Iterator<Integer> it = arr[ver].listIterator();
                while (it.hasNext()) {
                    int n = it.next();
                    if (!visit[n])
                        dfstraversal(n);
                }
            }
            void edge(int A, int B) {
                arr[A].add(B);
            }

            public static void main(String args[]) {
                Dfs graph = new Dfs(8);

                graph.edge(0, 1);
                graph.edge(0, 2);
                graph.edge(1, 2);
                graph.edge(1, 3);
                graph.edge(2, 3);
                graph.edge(2, 4);
                graph.edge(3, 4);
                graph.edge(3, 5);
                graph.edge(4, 6);
                graph.edge(5, 6);
                graph.edge(5, 7);
                graph.edge(6, 7);

                System.out.println("Dfs for the graph is:");
                graph.dfstraversal(0);
            }
        }


