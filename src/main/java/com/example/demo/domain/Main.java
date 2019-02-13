package com.example.demo.domain;

import java.util.Scanner;

public class Main {
String StationFrom;
String StationTo;
Railroad rail= new Railroad();

Scanner in = new Scanner(System.in);

System.out.println("Print Destinations");
System.out.println("Station From ");

StationFrom=in.nextLine();
System.out.print("Station To ");
StationTo=in.nextLine();
RailRoadController railControll= new RailRoadController(StationFrom,StationTo);
railControll.findResult(StationFrom,StationTo);
railControll.showResult();

}
