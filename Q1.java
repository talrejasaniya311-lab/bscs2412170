import java.util.*;

class Q1_GraphRepresentation {
    public static void main(String[] args) {
        int vertices = 4;

        int[][] matrix = new int[vertices][vertices];

        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (i != j) {
                    matrix[i][j] = 1;
                }
            }
        }

        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
            for (int j = 0; j < vertices; j++) {
                if (i != j) {
                    adjList.get(i).add(j);
                }
            }
        }

        System.out.println("\nAdjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.println(i + " -> " + adjList.get(i));
        }

        System.out.println("\nEdge List:");
        for (int i = 0; i < vertices; i++) {
            for (int j = i + 1; j < vertices; j++) {
                System.out.println("(" + i + ", " + j + ")");
            }
        }
    }
}