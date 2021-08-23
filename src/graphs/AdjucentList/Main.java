package graphs.AdjucentList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        ArrayList<GraphNode> nodeList= new ArrayList<>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));
        nodeList.add(new GraphNode("F", 5));
        nodeList.add(new GraphNode("G", 6));
//        nodeList.add(new GraphNode("H", 7));

        Graph graph = new Graph(nodeList);
        graph.addUndirectedEdge(0, 1);
        graph.addUndirectedEdge(0, 2);
        graph.addUndirectedEdge(1, 3);
        graph.addUndirectedEdge(1, 6);
        graph.addUndirectedEdge(2, 4);
        graph.addUndirectedEdge(3, 5);
        graph.addUndirectedEdge(4, 5);
        graph.addUndirectedEdge(5, 6);
        System.out.println(graph.printString());

        graph.BFSForSSSPP(nodeList.get(0));

//        System.out.println("\n");
//        graph.bfs();

//        System.out.println("\n");
//        graph.dfs();

//        System.out.println("\n");
//        Graph graph1 = new Graph(nodeList);
//        graph1.addDirectedEdge(0, 2);
//        graph1.addDirectedEdge(2, 4);
//        graph1.addDirectedEdge(4, 7);
//        graph1.addDirectedEdge(4, 5);
//        graph1.addDirectedEdge(5, 6);
//        graph1.addDirectedEdge(1, 2);
//        graph1.addDirectedEdge(1, 3);
//        graph1.addDirectedEdge(3, 5);
//        System.out.println(graph1.printString());
//
//        System.out.println("\n");
//        graph1.topologicalSort();
    }
}
