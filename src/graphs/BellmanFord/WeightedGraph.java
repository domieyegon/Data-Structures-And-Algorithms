package graphs.BellmanFord;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class WeightedGraph {
    ArrayList<WeightedNode> nodeList = new ArrayList<>();

    public WeightedGraph(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    void bellmanFord(WeightedNode sourceNode) {
        sourceNode.distance = 0;
        for (int i= 0; i < nodeList.size(); i++) {
            for (WeightedNode currentNode: nodeList) {
                for (WeightedNode neighbor: currentNode.neighbors) {
                    if (neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
                        neighbor.distance = (currentNode.distance + currentNode.weightMap.get(neighbor));
                        neighbor.parent =  currentNode;
                    }
                }
            }
        }

        System.out.println("Checking for negative Cycle...");
        for (WeightedNode currentNode: nodeList) {
            for (WeightedNode neighbor: currentNode.neighbors) {
                if (neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
                    System.out.println("Negative cycle found: \n");
                    System.out.println("Vertex Name: "+ neighbor.name);
                    System.out.println("Old cost: "+neighbor.distance);
                    int newDistance = currentNode.distance + currentNode.weightMap.get(neighbor);
                    System.out.println("New Cost: "+ newDistance);
                    return;
                }
            }
        }


        System.out.println("Negative cycle not found");
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.print("Node: " + nodeToCheck + " |Distance: " + nodeToCheck.distance + " |Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }

    }

    //Print path in the graph
    static void pathPrint(WeightedNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    void addWeightedEdge(int i, int j, int d) {
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neighbors.add(second);
        first.weightMap.put(second, d);
    }

}
