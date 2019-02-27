package com.company.railroad;

import org.jgrapht.*;
import org.jgrapht.Graph;
import org.jgrapht.alg.connectivity.*;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm.*;
import org.jgrapht.alg.interfaces.*;
import org.jgrapht.alg.shortestpath.*;
import org.jgrapht.graph.*;

import java.util.*;

public class RouteFactory {


    public Graph<String, DefaultEdge> createRoute() {

        Graph<String, DefaultEdge> directedRoute =
                new DefaultDirectedGraph<String, DefaultEdge>(DefaultEdge.class);

        directedRoute.addVertex("Lviv");
        directedRoute.addVertex("Krasne");
        directedRoute.addVertex("Ternopil");
        directedRoute.addVertex("Hmelnitskiy");
        directedRoute.addVertex("Starokonstantiniv");
        directedRoute.addVertex("Shepetivka");
        directedRoute.addVertex("NovgorodVolinskiy");
        directedRoute.addVertex("Jitomir");
        directedRoute.addVertex("Fastiv");
        directedRoute.addVertex("Kyiv");

        directedRoute.addEdge("Lviv", "Krasne");
        directedRoute.addEdge("Krasne", "Ternopil");
        directedRoute.addEdge("Hmelnitskiy", "Starokonstantiniv");
        directedRoute.addEdge("Starokonstantiniv", "Shepetivka");
        directedRoute.addEdge("Shepetivka", "NovgorodVolinskiy");
        directedRoute.addEdge("NovgorodVolinskiy", "Jitomir");
        directedRoute.addEdge("Jitomir", "Fastiv");
        directedRoute.addEdge("Fastiv", "Kyiv");


        return directedRoute;
    }
}
