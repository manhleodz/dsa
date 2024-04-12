package g.dsa.hw8.ex4.a;


import java.util.LinkedList;

public class Graph {

    private int V; // Số đỉnh của đồ thị
    private LinkedList<Integer> adj[]; // Danh sách kề

    // Khởi tạo đồ thị
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Thêm cạnh vào đồ thị
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFS(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        for (Integer n : adj[v]) {
            if (!visited[n])
                DFS(n, visited);
        }
    }

    // Duyệt đồ thị theo BFS
    void BFS(int s) {
        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            for (Integer n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("DFS traversal starting from vertex 2:");
        boolean visited[] = new boolean[g.V];
        g.DFS(2, visited);

        System.out.println("\nBFS traversal starting from vertex 2:");
        g.BFS(2);
    }
}