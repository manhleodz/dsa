package g.dsa.hw8.ex4.c;

public class Main {
    public static void main(String args[]) {
        HamiltonianCycle hamiltonian = new HamiltonianCycle();

    /* Let's create the following graph:
      (0)--(1)--(2)
       |   / \   |
       |  /   \  |
       | /     \ |
      (3)--------(4)
    */
        int graph1[][] = {
                {0, 1, 0, 1, 0},
                {1, 0, 1, 1, 1},
                {0, 1, 0, 0, 1},
                {1, 1, 0, 0, 1},
                {0, 1, 1, 1, 0},
        };

        hamiltonian.hamiltonianCycle(graph1);

    /* Let's create the following graph:
      (0)--(1)--(2)
       |   / \   |
       |  /   \  |
       | /     \ |
      (3)      (4)
    */
        int graph2[][] = {
                {0, 1, 0, 1, 0},
                {1, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
        };

        hamiltonian.hamiltonianCycle(graph2);
    }
}