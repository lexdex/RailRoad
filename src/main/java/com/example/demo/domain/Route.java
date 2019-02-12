package com.example.demo.domain;

import lombok.*;

import java.util.ArrayList;
import java.util.Date;

public class Route {

        private  int TrainID;
        private  String Dest_From;
        private String Dest_To;
        private long  unix_time;
        private Date  time;

        private ArrayList<String> nodeStation;



    public int getTrainID() {
        return TrainID;
    }

    public void setTrainID(int trainID) {
        TrainID = trainID;
    }

    public String getDest_From() {
        return Dest_From;
    }

    public void setDest_From(String dest_From) {
        Dest_From = dest_From;
    }

    public String getDest_To() {
        return Dest_To;
    }

    public void setDest_To(String dest_To) {
        Dest_To = dest_To;
    }

    public long getUnix_time() {
        return unix_time;
    }

    public void setUnix_time(long unix_time) {
        this.unix_time = unix_time;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }














}


