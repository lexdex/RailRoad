package com.company.railroad;

import org.jgrapht.*;
import org.jgrapht.Graph;
import org.jgrapht.alg.connectivity.*;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm.*;
import org.jgrapht.alg.interfaces.*;
import org.jgrapht.alg.shortestpath.*;
import org.jgrapht.graph.*;
import java.util.*;

import com.company.railroad.GraphFactory;
public class Traversal {

    public static void main(String[] args) {

        GraphFactory graphFactory=new GraphFactory();

       Graph<String, DefaultEdge> directedGraph = graphFactory.createGraph();
        // computes all the strongly connected components of the directed graph


        StrongConnectivityAlgorithm<String, DefaultEdge> scAlg =
                new KosarajuStrongConnectivityInspector<>(directedGraph);
        List<Graph<String, DefaultEdge>> stronglyConnectedSubgraphs =
                scAlg.getStronglyConnectedComponents();

        // prints the strongly connected components
        System.out.println("Strongly connected components:");
        for (int i = 0; i < stronglyConnectedSubgraphs.size(); i++) {
            System.out.println(stronglyConnectedSubgraphs.get(i));
        }
        System.out.println();



        var scAlgo =
                new BiconnectivityInspector<String, DefaultEdge>(directedGraph);
        var BiConnectedSubgraphs =
                scAlgo.getConnectedComponents();
        var Result= BiConnectedSubgraphs.toArray();

        for (int i = 0; i < Result.length; i++) {
            System.out.println(Result[i]);
        }
        System.out.println();



        var allpath= new AllDirectedPaths<String,DefaultEdge>(directedGraph);
        var singlepath=allpath.getAllPaths("Lviv","Kyiv",true,100);
        for (var i:singlepath) {
            System.out.println(i.getEdgeList());
        }



        System.out.println("Shortest path from Lviv to Kyiv:");
        DijkstraShortestPath<String, DefaultEdge> dijkstraAlg =
                new DijkstraShortestPath<>(directedGraph);
        SingleSourcePaths<String, DefaultEdge> iPaths = dijkstraAlg.getPaths("Lviv");
        System.out.println(iPaths.getPath("Kyiv") + "\n");


        System.out.println("Shortest path from Kyiv to Hmelnitskiy:");
        SingleSourcePaths<String, DefaultEdge> cPaths = dijkstraAlg.getPaths("Kyiv");
        System.out.println(cPaths.getPath("Hmelnitskiy"));


    }
}
