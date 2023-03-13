package Day3;

public class AdjacentMatrix {
    private final boolean[][] adjMatrix;
    private final int numVertices;

    // Initialize the matrix
    public AdjacentMatrix(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }

    // Add edges
    public void addEdge(int i, int j) {
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    // Remove edges
    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    // Print the matrix
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            s.append(i).append(": ");
            for (boolean j : adjMatrix[i]) {
                s.append(j ? 1 : 0).append(" ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    public static void main(String[] args) {
        AdjacentMatrix am = new AdjacentMatrix(5);

        am.addEdge(0, 1);
        am.addEdge(0, 2);
        am.addEdge(1, 2);
        am.addEdge(2, 0);
        am.addEdge(2, 3);
        am.addEdge(4,1);

        am.removeEdge(2, 4);
        System.out.print(am);
    }
}
