package com.company.railroad.domain;



import java.util.ArrayList;
import java.util.Date;

public class RouteNode {

    private  int ID;
    private  String Name;
    private long  Time;

    public RouteNode(int ID, String name, long time) {
        this.ID = ID;
        Name = name;
        Time = time;
    }

    public RouteNode(){}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getTime() {
        return Time;
    }

    public void setTime(long time) {
        Time = time;
    }





















}


