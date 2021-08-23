package graphs.dijktras;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WeightedNode implements Comparable<WeightedNode> {
    public String name;
    public ArrayList<WeightedNode> neighbors = new ArrayList<>();
    public HashMap<WeightedNode, Integer> weightMap = new HashMap<>();
    public boolean isVisited = false;
    public WeightedNode parent;
    public int distance;
    public int index;


    public WeightedNode(String name, int index) {
        this.name = name;
        this.index = index;
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
