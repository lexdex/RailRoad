package com.company.railroad;
import org.jgrapht.*;
import org.jgrapht.Graph;
import org.jgrapht.alg.connectivity.*;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm.*;
import org.jgrapht.alg.interfaces.*;
import org.jgrapht.alg.shortestpath.*;
import org.jgrapht.graph.*;
import java.util.*;

public class GraphFactory {
    public  Graph<String,DefaultEdge> createGraph()
    {

        Graph<String, DefaultEdge> directedGraph =
                new DefaultDirectedGraph<String, DefaultEdge>(DefaultEdge.class);

        directedGraph.addVertex("Lviv");
        directedGraph.addVertex("Kamyanobrid");
        directedGraph.addVertex("Yavoriv");
        directedGraph.addVertex("Mostiska");
        directedGraph.addVertex("KamyankaBuska");
        directedGraph.addVertex("VolodimirVolinskiy");
        directedGraph.addVertex("Kovel");
        directedGraph.addVertex("Lutsk");
        directedGraph.addVertex("Krasne");
        directedGraph.addVertex("Rivne");
        directedGraph.addVertex("Ternopil");
        directedGraph.addVertex("Shepetivka");
        directedGraph.addVertex("Starokonstantiniv");
        directedGraph.addVertex("Hmelnitskiy");
        directedGraph.addVertex("Jmerinka");
        directedGraph.addVertex("Vinnitsya");
        directedGraph.addVertex("Kalinivka");
        directedGraph.addVertex("Kozyatin");
        directedGraph.addVertex("NovgorodVolinskiy");
        directedGraph.addVertex("Korosten");
        directedGraph.addVertex("Jitomir");
        directedGraph.addVertex("Kozyatin");
        directedGraph.addVertex("Fastiv");
        directedGraph.addVertex("Kyiv");


        directedGraph.addEdge("Lviv", "Kamyanobrid");
        directedGraph.addEdge("Lviv", "KamyankaBuska");
        directedGraph.addEdge("Lviv", "Krasne");
        directedGraph.addEdge("Kamyanobrid", "Lviv");
        directedGraph.addEdge("KamyankaBuska", "Lviv");
        directedGraph.addEdge("Krasne", "Lviv");
        directedGraph.addEdge("Kamyanobrid", "Yavoriv");
        directedGraph.addEdge("Yavoriv", "Kamyanobrid");
        directedGraph.addEdge("KamyankaBuska", "Mostiska");
        directedGraph.addEdge("Mostiska", "KamyankaBuska");
        directedGraph.addEdge("KamyankaBuska", "VolodimirVolinskiy");
        directedGraph.addEdge("VolodimirVolinskiy", "KamyankaBuska");
        directedGraph.addEdge("KamyankaBuska", "VolodimirVolinskiy");
        directedGraph.addEdge("VolodimirVolinskiy", "Kovel");
        directedGraph.addEdge("Kovel", "VolodimirVolinskiy");
        directedGraph.addEdge("Kovel", "Lutsk");
        directedGraph.addEdge("Lutsk", "Kovel");
        directedGraph.addEdge("KamyankaBuska", "Lutsk");
        directedGraph.addEdge("Lutsk", "KamyankaBuska");
        directedGraph.addEdge("Lutsk", "Rivne");
        directedGraph.addEdge("Rivne", "Lutsk");
        directedGraph.addEdge("Krasne", "Rivne");
        directedGraph.addEdge("Rivne", "Krasne");
        directedGraph.addEdge("Krasne", "Ternopil");
        directedGraph.addEdge("Ternopil", "Krasne");
        directedGraph.addEdge("Ternopil", "Hmelnitskiy");
        directedGraph.addEdge("Hmelnitskiy", "Starokonstantiniv");
        directedGraph.addEdge("Starokonstantiniv", "Hmelnitskiy");
        directedGraph.addEdge("Starokonstantiniv", "Shepetivka");
        directedGraph.addEdge("Rivne", "Shepetivka");
        directedGraph.addEdge("Shepetivka", "Rivne");
        directedGraph.addEdge("Hmelnitskiy", "Jmerinka");
        directedGraph.addEdge("Jmerinka", "Hmelnitskiy");
        directedGraph.addEdge("Jmerinka", "Vinnitsya");
        directedGraph.addEdge("Vinnitsya", "Jmerinka");
        directedGraph.addEdge("Vinnitsya", "Kalinivka");
        directedGraph.addEdge("Kalinivka", "Vinnitsya");
        directedGraph.addEdge("Kalinivka", "Starokonstantiniv");
        directedGraph.addEdge("Starokonstantiniv", "Kalinivka");
        directedGraph.addEdge("Kozyatin", "Kalinivka");
        directedGraph.addEdge("Kalinivka", "Kozyatin");
        directedGraph.addEdge("Vinnitsya", "Kozyatin");
        directedGraph.addEdge("Kozyatin", "Vinnitsya");
        directedGraph.addEdge("Kozyatin", "Kalinivka");
        directedGraph.addEdge("Kalinivka", "Kozyatin");
        directedGraph.addEdge("Kozyatin", "Shepetivka");
        directedGraph.addEdge("Shepetivka", "Kozyatin");
        directedGraph.addEdge("Shepetivka", "NovgorodVolinskiy");
        directedGraph.addEdge("NovgorodVolinskiy", "Shepetivka");
        directedGraph.addEdge("NovgorodVolinskiy", "Korosten");
        directedGraph.addEdge("Korosten", "NovgorodVolinskiy");
        directedGraph.addEdge("Korosten", "Kyiv");
        directedGraph.addEdge("Kyiv", "Korosten");
        directedGraph.addEdge("NovgorodVolinskiy", "Jitomir");
        directedGraph.addEdge("Jitomir", "NovgorodVolinskiy");
        directedGraph.addEdge("Jitomir", "Fastiv");
        directedGraph.addEdge("Fastiv", "Jitomir");
        directedGraph.addEdge("Kozyatin", "Fastiv");
        directedGraph.addEdge("Fastiv", "Kozyatin");
        directedGraph.addEdge("Fastiv", "Kyiv");
        directedGraph.addEdge("Kyiv", "Fastiv");
        return  directedGraph;
    }
}
