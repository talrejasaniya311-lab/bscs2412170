import java.util.*;

class Q3_TopologicalSortDFS {
    static Map<Character, List<Character>> graph = new HashMap<>();
    static Set<Character> visited = new HashSet<>();
    static Stack<Character> stack = new Stack<>();

    static void addEdge(char u, char v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>());
    }

    static void dfs(char node) {
        visited.add(node);
        for (char neighbor : graph.get(node)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor);
            }
        }
        stack.push(node);
    }

    public static void main(String[] args) {
        // Edges from the given graph
        addEdge('m', 'q');
        addEdge('m', 'r');
        addEdge('m', 'x');

        addEdge('n', 'o');
        addEdge('n', 'q');
        addEdge('n', 'u');

        addEdge('o', 'r');
        addEdge('o', 's');
        addEdge('o', 'v');

        addEdge('p', 'o');
        addEdge('p', 's');
        addEdge('p', 'z');

        addEdge('q', 't');

        addEdge('r', 'u');
        addEdge('r', 'y');

        addEdge('s', 'r');

        addEdge('u', 't');

        addEdge('v', 'w');
        addEdge('v', 'x');

        addEdge('y', 'v');

        addEdge('w', 'z');

        for (char node : graph.keySet()) {
            if (!visited.contains(node)) {
                dfs(node);
            }
        }

        System.out.println("Topological Order:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}