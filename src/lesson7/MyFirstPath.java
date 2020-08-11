package lesson7;

import java.util.LinkedList;

public class MyFirstPath  {
    boolean[] marked;
    int[] edgeTo;
    int source;

    public MyFirstPath(Graph g, int source) {
        this.source = source;
        marked = new boolean[g.getVertexCount()];
        edgeTo = new int[g.getVertexCount()];
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public LinkedList<Integer> pathTo(int v) {
        if (!hasPathTo(v)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = v;
        while(vertex != source){
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }

}
