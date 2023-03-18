package Day5;

import java.util.ArrayList;


public class Graph {
    public static class Edge {
        int source;
        int dest;

        Edge(int src, int dst) {
            this.source = src;
            this.dest = dst;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(2, 1));
        graph[1].add(new Edge(3, 2));
        graph[1].add(new Edge(4, 0));
    }

    public static void main(String[] args) {
        int nodes = 4;
        ArrayList<Edge>[] graph = new ArrayList[nodes];
        createGraph(graph);

        for (int i = 0; i < graph[1].size(); i++) {
            Edge e = graph[1].get(i);
            System.out.print(e.dest + " ");
        }
    }
}
