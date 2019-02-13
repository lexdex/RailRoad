package com.example.demo.domain;

import java.util.ArrayList;

public class Route {

private int Id;
private String name;
private RouteNode Start;
private RouteNode FInish;
private Train train;
private ArrayList<RouteNode> routeNode;



    public Route(int id, String name, RouteNode start, RouteNode FInish, Train train, int length) {
        Id = id;
        this.name = name;
        Start = start;
        this.FInish = FInish;
        this.train = train;
        ArrayList<RouteNode> routeNode= new ArrayList<>(length);
    }


}
