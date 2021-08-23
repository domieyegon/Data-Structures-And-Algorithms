package graphs.questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Graph {

    public  static ArrayList<GraphNode> nodeList = new ArrayList<>();

    public enum State {
        Unvisited, Visited, Visiting
    }

    public Graph(ArrayList<GraphNode> nodeList) {
        Graph.nodeList = nodeList;
    }


    public void addDirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbors.add(second);
    }

    //Routes btwn Nodes
    boolean search(GraphNode start, GraphNode end) {
        LinkedList<GraphNode> queue = new LinkedList<>();

        for (GraphNode node: nodeList) {
            node.state = State.Unvisited;
        }
        start.state = State.Visiting;
        queue.add(start);

        GraphNode currentNode;
        while (!queue.isEmpty()) {
            currentNode = queue.removeFirst();
            if (currentNode != null) {
                for (GraphNode v: currentNode.neighbors) {
                    if (v.state == State.Unvisited) {
                        if (v== end) {
                            return true;
                        } else  {
                            v.state = State.Visiting;
                            queue.add(v);
                        }
                    }
                }

                currentNode.state = State.Visiting;
            }
        }

        return false;
    }
}
