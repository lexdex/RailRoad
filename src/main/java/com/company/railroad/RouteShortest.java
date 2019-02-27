package com.company.railroad;

import org.jgrapht.Graph;
import org.jgrapht.alg.connectivity.KosarajuStrongConnectivityInspector;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.interfaces.StrongConnectivityAlgorithm;
import org.jgrapht.alg.shortestpath.AllDirectedPaths;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultEdge;
import com.company.railroad.RouteFactory;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RouteShortest {


    public static void main(String[] args) {

        ArrayList<Graph<String, DefaultEdge>> routelist = new ArrayList<>();
        boolean checked;
        String StartStation, FinalStation;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  route starting station");
        StartStation = sc.next();
        System.out.println("Enter route final station");
        FinalStation = sc.next();


        GraphFactory graphFactory = new GraphFactory();
        Graph<String, DefaultEdge> AllRoutes = graphFactory.createGraph();

        RouteFactory routeFactory = new RouteFactory();
        var routeGraph = routeFactory.createRoute();
        var pred = new ArrayList<>(routeGraph.vertexSet());


        DijkstraShortestPath<String, DefaultEdge> dijkstraAlg =
                new DijkstraShortestPath<>(AllRoutes);

        ShortestPathAlgorithm.SingleSourcePaths<String, DefaultEdge> FinalPath = dijkstraAlg.getPaths(StartStation);

        try {
            if (FinalPath.getPath(FinalStation) != null) {
                System.out.println(FinalPath.getPath(FinalStation).getVertexList());
            } else {
                System.out.println("There is no path");
            }
        }
        catch (Exception e)
        {
            System.out.println("No path is found");
        }

    }
}
