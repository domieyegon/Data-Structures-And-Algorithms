package graphs.kruskal;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedNode("A"));
        nodeList.add(new WeightedNode("B"));
        nodeList.add(new WeightedNode("C"));
        nodeList.add(new WeightedNode("D"));
        nodeList.add(new WeightedNode("E"));

        Kruskal kruskal = new Kruskal(nodeList);
        kruskal.addWeightedUndirectedEdge(0, 1,5);
        kruskal.addWeightedUndirectedEdge(0, 2,13);
        kruskal.addWeightedUndirectedEdge(0, 4,15);
        kruskal.addWeightedUndirectedEdge(1, 2,10);
        kruskal.addWeightedUndirectedEdge(1, 3,8);
        kruskal.addWeightedUndirectedEdge(2, 3,6);
        kruskal.addWeightedUndirectedEdge(2, 4,20);

        System.out.println("Running Kruskal Algorithm on the Graph: ");
        kruskal.kruskal();
    }
}
