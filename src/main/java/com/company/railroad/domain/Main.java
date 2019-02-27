package com.company.railroad.domain;
import lombok.var;

import java.util.Scanner;

public class Main {
String StationFrom;
String StationTo;
Railroad rail= new Railroad();

Scanner in = new Scanner(System.in);

System.out.println("Print Destinations");
System.out.println("Station From ");
var StationFrom=in.nextLine();
System.out.print("Station To ");
var StationTo=in.nextLine();
RailRoadController railControll= new RailRoadController(StationFrom,StationTo);
railControll.findResult(StationFrom,StationTo);
railControll.showResult();

}
