package graphs.DisjoinSet;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedNode implements Comparable<WeightedNode> {
    public String name;
    public ArrayList<graphs.FloydWarshall.WeightedNode> neighbors = new ArrayList<>();
    public HashMap<graphs.FloydWarshall.WeightedNode, Integer> weightMap = new HashMap<>();
    public boolean isVisited = false;
    public graphs.FloydWarshall.WeightedNode parent;
    public int distance;
    public DisjointSet set;


    public WeightedNode(String name) {
        this.name = name;
        distance = Integer.MAX_VALUE;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(WeightedNode weightedNode) {
        return this.distance - weightedNode.distance;
    }
}
