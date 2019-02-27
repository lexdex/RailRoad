package com.company.railroad.domain;

import java.util.ArrayList;

public class Carriage {
    //private enum CarriageType { SV, Platskart, Intercity; }
    private static final int NumberOfPlaces = 60;
    private ArrayList<Byte> booked;

    public Carriage() {
        booked = new ArrayList<>(NumberOfPlaces);
    }


    public int BookPlace(int i) {
        if (booked.get(i) != (byte) 1) {
            booked.set(i, (byte) 1);
            return 0;
        } else {
            return -1;
        }

    }

    public int ReverseBookPlace(int i) {
        if (booked.get(i) != (byte) 0) {
            booked.set(i, (byte) 0);
            return 0;
        } else {
            return -1;
        }
    }


    public int CountFreePlaces() {
        int count = 0;
        for (byte i : booked) {
            if (i == (byte) 1)
                count++;
        }
        return count;
    }

    public void showBooking() {
        for (Byte book : booked) {
            int i = 0;
            System.out.println("place number  " + i + " " + "book status  " + book);
            i++;
        }
    }

    void addToList(ArrayList<Byte> booked) {
        booked.addAll(booked);
    }


}
