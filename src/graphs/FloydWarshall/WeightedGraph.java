package graphs.FloydWarshall;

import java.util.ArrayList;

public class WeightedGraph {
    ArrayList<WeightedNode> nodeList = new ArrayList<>();

    public WeightedGraph(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    void floydWarshall() {
        int size = nodeList.size();
        int[][] v = new int[size][size];
        for (int i = 0; i < size; i++) {
            WeightedNode first = nodeList.get(i);
            for (int j = 0; j < size; j++) {
                WeightedNode second = nodeList.get(j);
                if (i == j) {
                    v[i][j] = 0;
                } else if (first.weightMap.containsKey(second)) {
                    v[i][j] = first.weightMap.get(second);
                } else {
                    v[i][j] = Integer.MAX_VALUE / 10;
                }
            }
        }

        for (int k = 0; k < nodeList.size(); k++) {
            for (int i = 0; i < nodeList.size(); i++) {
                for (int j = 0; j < nodeList.size(); j++) {
                    if (v[i][j] > v[i][k] + v[k][j]) {
                        v[i][j] = v[i][k] + v[k][j];
                    }
                }
            }
        }



        for (int i = 0; i < size; i++) {
            System.out.print("Printing distance list from node " + nodeList.get(i) + ": ");
            for (int j = 0; j < size; j++) {
                System.out.print(v[i][j]+" ");
            }
            System.out.println();
        }

    }

    void addWeightedEdge(int i, int j, int d) {
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neighbors.add(second);
        first.weightMap.put(second, d);
    }

}
