package graphs.DisjoinSet;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<WeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedNode("A"));
        nodeList.add(new WeightedNode("B"));
        nodeList.add(new WeightedNode("C"));
        nodeList.add(new WeightedNode("D"));


        DisjointSet.makeSet(nodeList);

        WeightedNode first = nodeList.get(0);
        WeightedNode second = nodeList.get(1);
        DisjointSet output = DisjointSet.findSet(second);
        output.printAllNodesOfThisSet();

        DisjointSet.union(first, second);
        DisjointSet output2 = DisjointSet.findSet(second);
        output2.printAllNodesOfThisSet();

    }
}
