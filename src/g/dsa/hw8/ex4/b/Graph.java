package g.dsa.hw8.ex4.b;

import java.util.*;

class Graph {
    private int V;
    private List<List<Node>> adj;

    class Node {
        int vertex;
        int weight;

        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    Graph(int V) {
        this.V = V;
        adj = new ArrayList<>(V);

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int source, int destination, int weight) {
        Node newNode = new Node(destination, weight);
        adj.get(source).add(newNode);
    }

    void dijkstra(int source) {
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];
        PriorityQueue<Node> pq = new PriorityQueue<>(V, Comparator.comparingInt(node -> node.weight));

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        pq.add(new Node(source, 0));
        dist[source] = 0;

        while (!pq.isEmpty()) {
            int u = pq.remove().vertex;
            visited[u] = true;

            for (Node neighbor : adj.get(u)) {
                int v = neighbor.vertex;
                int weight = neighbor.weight;

                if (!visited[v] && dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Node(v, dist[v]));
                }
            }
        }

        // In kết quả
        System.out.println("Đường đi ngắn nhất từ đỉnh " + source + ":");

        for (int i = 0; i < V; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println("Không có đường đi từ " + source + " đến " + i);
            } else {
                System.out.println("Đỉnh " + i + ": " + dist[i]);
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;
        int source = 0;
        Graph graph = new Graph(V);

        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 3, 2);
        graph.addEdge(1, 2, 5);
        graph.addEdge(2, 3, 7);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 0, 4);
        graph.addEdge(4, 1, 4);
        graph.addEdge(4, 5, 6);

        graph.dijkstra(source);
    }
}
