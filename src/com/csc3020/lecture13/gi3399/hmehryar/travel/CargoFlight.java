package com.csc3020.lecture13.gi3399.hmehryar.travel;

import com.csc3020.lecture12.gi3399.Flight;

import java.io.IOException;

public class CargoFlight extends Flight {
    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;
    protected int legacyFlightNumber;

    public CargoFlight(int flightNumber) {
        super(flightNumber);
    }

    public CargoFlight(int flightNumber, float maxCargoSpace) {
        this(flightNumber);
        this.maxCargoSpace = maxCargoSpace;
        legacyFlightNumber = 0;
    }
//    public int seats = 12;

    public CargoFlight() {
//        super();
    }
    public CargoFlight(float maxCargoSpace) {
        this.maxCargoSpace = maxCargoSpace;
    }

    @Override
    public int getSeats() {
        return 12;
    }

    //Test for exception compatiblility
    @Override
    public void addPassengers(String fileName) throws IOException, NullPointerException {
        super.addPassengers(fileName);
        throw new NullPointerException("It is pointing to nowhere!!!!");
    }

    public final void add1Package(float h, float w, float d){
        double size = h*w*d;
        if(hasCargoSpace(size))
            usedCargoSpace += size;
        else
            handleNoSpace();
    }

    private boolean hasCargoSpace(double size){
        return usedCargoSpace + size <= maxCargoSpace;
    }

    private void handleNoSpace(){
        System.out.println("Not enough space");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Max Cargo Space = " + maxCargoSpace + ", Used Cargo Space = " + usedCargoSpace);
    }
}
