package graphs.AdjucentMatrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {

    ArrayList<GraphNode> nodeList = new ArrayList<>();
    int[][] adjacencyMatrix;

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
        this.adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }


    String printString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("   ");

        for (GraphNode value : nodeList) {
            stringBuilder.append(value.name).append(" ");
        }

        stringBuilder.append("\n");

        int i = 0;
        for (GraphNode value : nodeList) {
            stringBuilder.append(value.name).append(": ");
            for (int j : adjacencyMatrix[i]) {
                stringBuilder.append(j).append(" ");
            }
            stringBuilder.append("\n");

            i++;
        }

        return stringBuilder.toString();

    }

    //BFS
    //get neighbors for a node
    public ArrayList<GraphNode> getNeighbors(GraphNode node) {
        ArrayList<GraphNode> neighbors = new ArrayList<>();
        int nodeIndex = node.index;
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[nodeIndex][i] == 1) {
                neighbors.add(nodeList.get(i));
            }
        }

        return neighbors;
    }

    //BSF internal
    void bfsVisit(GraphNode node) {
        ArrayList<GraphNode> queue = new ArrayList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
            for (GraphNode neighbor : neighbors) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    public void bfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }
    }

    //DFS
    //internal
    void dfsVisit(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
            for (GraphNode neighbor : neighbors) {
                if (!neighbor.isVisited) {
                    stack.push(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
        //Time Complexity = O(V + E)
        //Space Complexity = O(V + E)
    }

    void dfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                dfsVisit(node);
            }
        }
    }


    //    TOPOLOGICAL SORT ALGORITHM
    void addDirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
    }

    void topologicalVisit(GraphNode node, Stack<GraphNode> stack) {
        ArrayList<GraphNode> neighbors = getNeighbors(node);
        for (GraphNode neighbor : neighbors) {
            if (!neighbor.isVisited) {
                topologicalVisit(neighbor, stack);
            }
        }

        node.isVisited = true;
        stack.push(node);
    }

    void topological() {
        Stack<GraphNode> stack = new Stack<>();
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                topologicalVisit(node, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop().name+ " ");
        }
    }


    //Single Source Shortest Path Problem
    //Print path in the graph
    static void pathPrint(GraphNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    public void BFSForSSSPP(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print("Path for node: "+currentNode.name+ ": ");
            pathPrint(currentNode);
            System.out.println();
            ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
            for (GraphNode neighbor:neighbors)  {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                    neighbor.parent = currentNode;
                }
            }
        }
        //Time complexity = O(E)
        //Space complexity = O(V)
    }

}
