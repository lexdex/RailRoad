package com.company.railroad.domain;

import java.util.ArrayList;

public class Train {
    private int Id;
    private String Name;
    private ArrayList<Carriage> carriages;


    public Train(int id, String name, int CarriagesNumber) {
        Id = id;
        Name = name;
        ArrayList<Carriage> carriages= new ArrayList<>(CarriagesNumber);
    }
    public Train(){}

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }



    public int TrainBookPlace(int carriageIndex,int placeIndex) {
        if  (carriages.size()> carriageIndex)
        {
            carriages.get(carriageIndex).BookPlace(placeIndex);
            return 0;
        }
        else{return -1;}

    }

    public int TrainReverseBookPlace(int carriageIndex,int placeIndex) {
        if  (carriages.size()> carriageIndex)
        {
            carriages.get(carriageIndex).ReverseBookPlace(placeIndex);
            return 0;
        }
        else{return -1;}

    }

    public int CountTrainFreePlaces () {
        int count = 0;
        for (Carriage car : carriages) {
           count+=car.CountFreePlaces();
        }
        return count;
    }

    public void showTrainBooking() {
        for (Carriage car: carriages) {
            int i = 0;
            System.out.println("carriage number "+i);
            car.showBooking();
            i++;
        }
    }



    void addToList(ArrayList<Carriage> carriage) {
        carriages.addAll(carriage);
    }





}
