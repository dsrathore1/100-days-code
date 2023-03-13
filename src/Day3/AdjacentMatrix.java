package Day3;
//! Undirected Graph
public class AdjacentMatrix {
    private final int V;
    private int E;
    private final int[][] adjMatrix;

    public AdjacentMatrix(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adjMatrix = new int[nodes][nodes];
    }

    public void addEdges(int u, int v) {
        //? This is because it is an undirected graph
        adjMatrix[u][v] = 1;
//        adjMatrix[v][u] = 1;
        E++;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V).append(" Vertices, ").append(E).append(" Edges \n");
        for (int i = 0; i < V; i++) {
            s.append(i).append(" : ");
            for (int j : adjMatrix[i]) {
                s.append(j).append(" ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    public static void main(String[] args) {
        AdjacentMatrix am = new AdjacentMatrix(4);
        am.addEdges(1, 2);
        am.addEdges(3, 1);
        am.addEdges(1, 0);
        am.addEdges(0, 3);
        am.addEdges(2, 0);
        am.addEdges(2, 1);
        am.addEdges(2, 2);
        am.addEdges(2, 3);

        System.out.println(am);
    }
}