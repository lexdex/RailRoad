package com.company.railroad;

import org.jgrapht.Graph;
import org.jgrapht.alg.connectivity.BiconnectivityInspector;
import org.jgrapht.alg.connectivity.KosarajuStrongConnectivityInspector;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.interfaces.StrongConnectivityAlgorithm;
import org.jgrapht.alg.shortestpath.AllDirectedPaths;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.traverse.DepthFirstIterator;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    private static final int maxPath=1000;

    public static void main(String[] args) {
       // String Source="Lviv";
        //String Target="Kyiv";


        String Source,Target;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter  route starting station");
        Source=sc.next();
        System.out.println("Enter route final station");
        Target=sc.next();

        RouteFactory routeFactory=new RouteFactory();
        var routeGraph=routeFactory.createRoute();
        var pred=new ArrayList<>(routeGraph.vertexSet());
        System.out.println(pred);

        GraphFactory graphFactory = new GraphFactory();
        Graph<String, DefaultEdge> AllRoutesGraph = graphFactory.createGraph();

         var all=AllRoutesGraph.vertexSet();
        //System.out.println(all);



        var allpath = new AllDirectedPaths<String, DefaultEdge>(AllRoutesGraph)
                .getAllPaths(Source, Target, true, maxPath);

        for (var i:allpath){
            System.out.println(i.getEdgeList());
        }

        //prints only path which is equal to the target graph
        var results=allpath.stream().filter(e->e.getVertexList().equals(pred)).collect(Collectors.toList());

        try {
            if (results != null) {
                System.out.println(results);
            }
        }
        catch  (Exception e)
        {
            System.out.println("There is no such path ");
        }

       // for (var i:results){
         //   System.out.println(i.getVertexList());
        //}




        //for (var i : results) {
         //System.out.println(i.getVertexList());
            //System.out.println(i.getEdgeList());
       // }


    }
}


