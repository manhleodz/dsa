package g.dsa.hw8_21000691_doanducmanh.ex4.c;

class HamiltonianCycle {
    final int V = 5;
    int path[];

    boolean isSafe(int v, int graph[][], int path[], int pos) {
        if (graph[path[pos - 1]][v] == 0)
            return false;

        for (int i = 0; i < pos; i++)
            if (path[i] == v)
                return false;

        return true;
    }

    boolean hamiltonianCycleUtil(int graph[][], int path[], int pos) {
        if (pos == V) {
            if (graph[path[pos - 1]][path[0]] == 1)
                return true;
            else
                return false;
        }

        for (int v = 1; v < V; v++) {
            if (isSafe(v, graph, path, pos)) {
                path[pos] = v;
                if (hamiltonianCycleUtil(graph, path, pos + 1) == true)
                    return true;
                path[pos] = -1;
            }
        }

        return false;
    }

    int hamiltonianCycle(int graph[][]) {
        path = new int[V];
        for (int i = 0; i < V; i++)
            path[i] = -1;

        path[0] = 0;
        if (hamiltonianCycleUtil(graph, path, 1) == false) {
            System.out.println("\nSolution does not exist");
            return 0;
        }

        printSolution(path);
        return 1;
    }

    void printSolution(int path[]) {
        System.out.println("Solution Exists: Following is one Hamiltonian Cycle");
        for (int i = 0; i < V; i++)
            System.out.print(" " + path[i] + " ");

        System.out.println(" " + path[0] + " ");
    }
}