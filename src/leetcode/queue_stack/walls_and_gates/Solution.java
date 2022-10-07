package leetcode.queue_stack.walls_and_gates;

import java.util.*;

enum CellType {
    WALL(-1), GATE(0), EMPTY(Integer.MAX_VALUE);
    public final Integer label;
    CellType(int label) {
        this.label = label;
    }
}
class Pair<T, S>{
    public T i;
    public S j;
    Pair(T i, S j) {
        this.i = i;
        this.j = j;
    }
}

public class Solution {
    public void wallsAndGates(int[][] rooms) {
        List<Pair<Integer, Integer>> gates = new ArrayList<>();
        int row = rooms.length;
        int column = rooms[0].length;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                if(rooms[i][j] == CellType.GATE.label) {
                    gates.add(new Pair<>(i, j));
                }
            }
        }

        for(int i = 0; i < gates.size(); i++) {
            System.out.println(gates.get(i).i + " " + gates.get(i).j);
        }
    }

    public void runBFS(Pair<Integer, Integer> gate, int[][] rooms) {
        Set<Pair<Integer, Integer>> visited = new HashSet<>();
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        queue.add(gate);
        visited.add(gate);

        while(!queue.isEmpty()) {
            Pair<Integer, Integer> node = queue.remove();
            //get adjacent
            //upper
            if(node.i - 1 >= 0) {
                Pair<Integer, Integer> upperAdj = new Pair<>(node.i - 1, node.j);
                if(!visited.contains(upperAdj) && rooms[upperAdj.i][upperAdj.j] == CellType.EMPTY.label) {

                }
            }

            //lower
            //right
            //left
        }
    }
}
