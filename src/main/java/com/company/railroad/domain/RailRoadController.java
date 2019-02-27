package com.company.railroad.domain;

import java.util.ArrayList;
import java.util.Date;

public class RailRoadController extends Railroad {

    protected String requestStart;
    protected String requestEnd;
    protected ArrayList<Route> results;

    public RailRoadController(String requestStart, String requestEnd) {
        super();
        this.requestStart = requestStart;
        this.requestEnd = requestEnd;
        ArrayList<Route> results = new ArrayList<Route>();
    }

    public ArrayList<Route> findResult(String requestStart, String requestEnd) {
        for (Route railpath : railroad) {
            boolean checked = false;

            for (RouteNode routNodes : railpath.routes) {
                if (routNodes.getName() == requestStart) {
                    checked = true;
                    if (routNodes.getName() == requestEnd && checked ==true) {
                        results.add(railpath);
                    }
                }
            }
            checked = false;
        }
        return results;
    }


    void showResult() {
        if (results.isEmpty()) {
            System.out.println("There are no results");
        } else {
            for (Route rout : results) {
                rout.showRouteInfo();
            }

        }
    }


    void showRouteBook(Route route) {
        route.getTrain().showTrainBooking();
    }

    void showFreePlaces(Route route) {
        route.getTrain().CountTrainFreePlaces();
    }

    void bookPlace(Route route, int carriageIndex, int placeIndex) {
        route.getTrain().TrainBookPlace(carriageIndex, placeIndex);
    }

    void reversebookPlace(Route route, int carriageIndex, int placeIndex) {
        route.getTrain().TrainReverseBookPlace(carriageIndex, placeIndex);
    }


}