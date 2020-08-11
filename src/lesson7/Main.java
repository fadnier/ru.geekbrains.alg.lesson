package lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addEdge(1,2);
        graph.addEdge(0,4);
        graph.addEdge(1,4);
        graph.addEdge(3,4);
        graph.addEdge(2,4);
        graph.addEdge(6,3);
        graph.addEdge(7,8);
        graph.addEdge(9,1);
        graph.addEdge(5,4);
        graph.addEdge(7,9);
        graph.addEdge(7,1);
        graph.addEdge(6,8);
        graph.addEdge(1,5);
        graph.addEdge(0,8);
        graph.addEdge(7,2);


//        System.out.println(graph.getAdjList(1));
//
//        DepthFirstPaths dfp = new DepthFirstPaths(graph, 7 );
//        System.out.println(dfp.hasPathTo(7));
//        System.out.println(dfp.pathTo(1));
//        System.out.println(dfp.hasPathTo(1));


        BreadthFirstPath bfp = new BreadthFirstPath(graph, 7);
//        System.out.println(bfp.hasPathTo(7));
        System.out.println("Кратчайший путь " + bfp.pathTo(3)+". Длинна пути "+bfp.pathTo(3).size());
        System.out.println("Кратчайший путь " + bfp.pathTo(2)+". Длинна пути "+bfp.pathTo(2).size());
//        System.out.println(bfp.hasPathTo(1));

    }
}
