package com.company.railroad.domain;


import java.util.ArrayList;
import java.util.Date;

public class Route {

    private int Id;
    private String name;
    private RouteNode Start;
    private RouteNode Finish;
    private Date startTime;
    private Train train;
    protected ArrayList<RouteNode> routes;


    public  Route(int id, String name, RouteNode start, RouteNode Finish, Train train, Date startTime, int length) {
        Id = id;
        this.name = name;
        Start = start;
        this.Finish = Finish;
        this.train = train;
        this.startTime=startTime;
        ArrayList<RouteNode> routes = new ArrayList<>(length);
    }

    public Route() {
    }

    public int TrainBookPlace(Route route, int carriageIndex, int placeIndex) {
        if (route.getTrain().TrainBookPlace(carriageIndex, placeIndex) != -1) {
            return 0;
        } else {
            return -1;
        }

    }


    public int TrainReverseBookPlace(Route route, int carriageIndex, int placeIndex) {
        if (route.getTrain().TrainReverseBookPlace(carriageIndex, placeIndex) != -1) {
            return 0;
        } else {
            return -1;
        }

    }

    public int CountTrainFreePlaces(Train T) {
        return T.CountTrainFreePlaces();
    }

    public void showTrainBooking(Train T) {
        T.showTrainBooking();
    }

    public void showRouteInfo() {
        System.out.println("Route ID " + this.getId() + "Route Name " + this.getName() +
            "Route Start " + this.getStart() + "Route Finish " + this.getFinish() + "Train " + this.getTrain() +
            "Date "+ this.getStartTime());
   }

    void addToList(ArrayList<RouteNode> route) {
        routes.addAll(route);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RouteNode getStart() {
        return Start;
    }

    public void setStart(RouteNode start) {
        Start = start;
    }

    public RouteNode getFinish() {
        return Finish;
    }

    public void setFInish(RouteNode Finish) {
        this.Finish = Finish;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }



}
